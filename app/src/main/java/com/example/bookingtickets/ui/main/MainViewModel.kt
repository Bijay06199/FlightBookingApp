package com.example.bookingtickets.ui.main

import android.content.Intent
import android.view.View
import com.example.bookingtickets.base.BaseViewModel
import com.example.bookingtickets.ui.flight.FlightActivity

class MainViewModel : BaseViewModel() {
    var fromText: String = ""
    var toText: String = ""
    var departureText: String = ""
    var classText: String = ""
    var travellersText: String = ""
    val txtOneWay: String = ""
    val txtRoundTrip: String = ""
    val txtMultiCity: String = ""

    fun searchFlight(view: View) {
        Intent(view.context, FlightActivity::class.java).also {
            view.context.startActivity(it)
        }
    }


}