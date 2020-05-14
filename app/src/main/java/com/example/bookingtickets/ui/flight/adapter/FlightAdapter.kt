package com.example.bookingtickets.ui.flight.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.AdapterView
import androidx.core.graphics.toColor
import androidx.core.graphics.toColorInt
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.bookingtickets.R
import com.example.bookingtickets.databinding.RecyclerviewItemForFlightBinding
import com.example.bookingtickets.ui.flight.model.FlightModel
import kotlinx.android.synthetic.main.recyclerview_item_for_flight.view.*

class FlightAdapter(private val listener: OnItemClickListener) :
    RecyclerView.Adapter<FlightAdapter.FlightViewHolder>() {
    var itemList = ArrayList<FlightModel>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FlightViewHolder {
        val flightBinding: RecyclerviewItemForFlightBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.recyclerview_item_for_flight, parent, false
        )
        return FlightViewHolder(flightBinding)
    }

    override fun getItemCount(): Int = itemList.size

    @SuppressLint("ResourceAsColor")
    override fun onBindViewHolder(holder: FlightViewHolder, position: Int) {
        holder.mBinding.model = itemList[position]
        if (position == 0) {
            holder.mBinding.root.tv_price.setTextColor(R.color.yellow)
        }

        if (position == 2) {
            holder.mBinding.root.tv_price.setTextColor(R.color.yellow)
        }

        if (position == 4) {
            holder.mBinding.root.tv_price.setTextColor(R.color.red)
        }

        if (position == 5) {
            holder.mBinding.root.tv_price.setTextColor(R.color.yellow)
        }
        if (position == 7) {
            holder.mBinding.root.tv_price.setTextColor(R.color.red)
        }




        holder.mBinding.root.setOnClickListener {
            listener.onFlightItemClick(holder.adapterPosition, itemList[holder.adapterPosition])
        }
    }

    interface OnItemClickListener {
        fun onFlightItemClick(position: Int, itemList: FlightModel)
    }


    inner class FlightViewHolder(var mBinding: RecyclerviewItemForFlightBinding) :
        RecyclerView.ViewHolder(mBinding.root)

    fun addAll(itemList: ArrayList<FlightModel>) {
        this.itemList = itemList
        notifyDataSetChanged()
    }
}