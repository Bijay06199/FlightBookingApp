package com.example.bookingtickets

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ticket.*

class TicketActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ticket)
        initView()
    }

    private fun initView() {

        iv_back_ticket.setOnClickListener {
            startActivity(Intent(this@TicketActivity,FlightActivity::class.java))
        }
    }
}
