package com.example.bookingtickets.di

import com.example.bookingtickets.ui.flight.FlightViewModel
import com.example.bookingtickets.ui.main.MainViewModel
import com.example.bookingtickets.ui.ticket.TicketViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module

val viewModelModule: Module =module{

    viewModel { MainViewModel() }
    viewModel { TicketViewModel() }
    viewModel { FlightViewModel() }
}