package com.example.bookingtickets

import android.app.Application
import com.example.bookingtickets.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidFileProperties
import org.koin.core.context.startKoin

class BookingTicket:Application(){

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@BookingTicket)

            androidFileProperties()

            modules(
                listOf(
                    viewModelModule
                )
            )
        }
    }
}