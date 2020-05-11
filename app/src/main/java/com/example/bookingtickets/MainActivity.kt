package com.example.bookingtickets

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView() {
        cv_flight.setOnClickListener {
            startActivity(Intent(this@MainActivity,FlightActivity::class.java))
        }
        iv_back_main.setOnClickListener {
            finish()
        }
    }
}
