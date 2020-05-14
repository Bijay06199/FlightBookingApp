package com.example.bookingtickets.ui.main

import android.content.Intent
import android.os.Bundle
import com.example.bookingtickets.BR
import com.example.bookingtickets.R
import com.example.bookingtickets.base.BaseActivity
import com.example.bookingtickets.databinding.ActivityMainBinding
import com.example.bookingtickets.ui.flight.FlightActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>() {
    override fun getLayoutId(): Int = R.layout.activity_main
    private val mainViewModel: MainViewModel by viewModel()
    override fun getViewModel(): MainViewModel = mainViewModel

    override fun getBindingVariable(): Int {
        return BR.viewModel
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initView()
        if (savedInstanceState == null) {
            viewDataBinding.cvOneway.setCardBackgroundColor(getColor(R.color.black))
            viewDataBinding.tvOneWay.setTextColor(getColor(R.color.white))
        }
    }

    private fun initView() {

        with(viewDataBinding) {

            topAppBar.setNavigationOnClickListener {
                finish()
            }
            cvOneway.setOnClickListener {
                cvOneway.setCardBackgroundColor(getColor(R.color.black))
                tvOneWay.setTextColor(getColor(R.color.white))
                cvRoundTrip.setCardBackgroundColor(getColor(R.color.white))
                tvRoundTrip.setTextColor(getColor(R.color.black))
                cvMultiCity.setCardBackgroundColor(getColor(R.color.white))
                tvMultiCity.setTextColor(getColor(R.color.black))
            }


            cvRoundTrip.setOnClickListener {
                cvRoundTrip.setCardBackgroundColor(getColor(R.color.black))
                tvRoundTrip.setTextColor(getColor(R.color.white))
                cvOneway.setCardBackgroundColor(getColor(R.color.white))
                tvOneWay.setTextColor(getColor(R.color.black))
                cvMultiCity.setCardBackgroundColor(getColor(R.color.white))
                tvMultiCity.setTextColor(getColor(R.color.black))
            }

            cvMultiCity.setOnClickListener {
                cvMultiCity.setCardBackgroundColor(getColor(R.color.black))
                tvMultiCity.setTextColor(getColor(R.color.white))
                cvOneway.setCardBackgroundColor(getColor(R.color.white))
                tvOneWay.setTextColor(getColor(R.color.black))
                cvRoundTrip.setCardBackgroundColor(getColor(R.color.white))
                tvRoundTrip.setTextColor(getColor(R.color.black))
            }


        }

    }
}
