package com.example.bookingtickets.ui.ticket

import android.content.Intent
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.example.bookingtickets.BR
import com.example.bookingtickets.R
import com.example.bookingtickets.base.BaseActivity
import com.example.bookingtickets.databinding.ActivityTicketBinding
import com.example.bookingtickets.ui.flight.FlightActivity
import kotlinx.android.synthetic.main.activity_ticket.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class TicketActivity : BaseActivity<ActivityTicketBinding, TicketViewModel>() {
    override fun getLayoutId(): Int = R.layout.activity_ticket
    private val ticketViewModel: TicketViewModel by viewModel()
    override fun getViewModel(): TicketViewModel = ticketViewModel

    override fun getBindingVariable(): Int {
        return BR.viewModel
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initView()
    }

    private fun initView() {


        with(viewDataBinding) {
            topAppBar.setNavigationOnClickListener {
                startActivity(Intent(this@TicketActivity, FlightActivity::class.java))
            }
            topAppBar.overflowIcon =
                ContextCompat.getDrawable(this@TicketActivity, R.drawable.options)
        }


    }
}
