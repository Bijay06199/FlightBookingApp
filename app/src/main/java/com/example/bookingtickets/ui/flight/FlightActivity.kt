package com.example.bookingtickets.ui.flight

import android.content.Intent
import android.os.Bundle
import androidx.core.graphics.toColorInt
import com.example.bookingtickets.BR
import com.example.bookingtickets.R
import com.example.bookingtickets.base.BaseActivity
import com.example.bookingtickets.databinding.ActivityFlightBinding
import com.example.bookingtickets.ui.flight.adapter.FlightAdapter
import com.example.bookingtickets.ui.flight.model.FlightModel
import com.example.bookingtickets.ui.main.MainActivity
import com.example.bookingtickets.ui.ticket.TicketActivity
import kotlinx.android.synthetic.main.activity_flight.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class FlightActivity : BaseActivity<ActivityFlightBinding, FlightViewModel>(),
    FlightAdapter.OnItemClickListener {
    override fun onFlightItemClick(position: Int, itemList: FlightModel) {
        startActivity(Intent(this@FlightActivity, TicketActivity::class.java))


    }

    lateinit var flightAdapter: FlightAdapter
    override fun getLayoutId(): Int = R.layout.activity_flight
    private val flightViewModel: FlightViewModel by viewModel()
    override fun getViewModel(): FlightViewModel = flightViewModel

    override fun getBindingVariable(): Int {
        return BR.viewModel
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initView()
        setUpRecyclerView()
    }

    private fun setUpRecyclerView() {
        flightAdapter = FlightAdapter(this)
        viewDataBinding.recyclerViewFlight.adapter = flightAdapter
        var itemList = ArrayList<FlightModel>()
        itemList.add(FlightModel(R.drawable.spicejet, "$255", "8:00pm", "2:15pm"))
        itemList.add(FlightModel(R.drawable.indigo, "$755", "9:00pm", "3:15pm"))
        itemList.add(FlightModel(R.drawable.qatar, "$285", "8:00pm", "6:15pm"))
        itemList.add(FlightModel(R.drawable.vista, "$655", "8:00pm", "2:15pm"))
        itemList.add(FlightModel(R.drawable.spicejet, "$655", "8:00pm", "2:15pm"))
        itemList.add(FlightModel(R.drawable.indigo, "$655", "8:00pm", "2:15pm"))
        itemList.add(FlightModel(R.drawable.qatar, "$655", "8:00pm", "2:15pm"))
        itemList.add(FlightModel(R.drawable.vista, "$655", "8:00pm", "2:15pm"))
        itemList.add(FlightModel(R.drawable.spicejet, "$655", "8:00pm", "2:15pm"))
        itemList.add(FlightModel(R.drawable.indigo, "$655", "8:00pm", "2:15pm"))
        itemList.add(FlightModel(R.drawable.qatar, "$655", "8:00pm", "2:15pm"))
        itemList.add(FlightModel(R.drawable.vista, "$655", "8:00pm", "2:15pm"))
        itemList.add(FlightModel(R.drawable.spicejet, "$655", "8:00pm", "2:15pm"))

        flightAdapter.addAll(itemList)
    }

    private fun initView() {
        with(viewDataBinding) {


            topAppBar.setNavigationOnClickListener() {
                startActivity(Intent(this@FlightActivity, MainActivity::class.java))
            }
        }

    }
}
