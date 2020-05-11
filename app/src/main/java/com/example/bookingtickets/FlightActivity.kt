package com.example.bookingtickets

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_flight.*

class FlightActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flight)
        initView()
    }

    private fun initView() {
        cv_spice_jet.setOnClickListener {
            startActivity(Intent(this@FlightActivity,TicketActivity::class.java))
        }

        iv_back_flight.setOnClickListener {
            startActivity(Intent(this@FlightActivity,MainActivity::class.java))
        }
    }
}
