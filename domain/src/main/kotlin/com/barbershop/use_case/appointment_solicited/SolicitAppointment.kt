package com.barbershop.use_case.appointment_solicited

import com.barbershop.model.Appointment

interface SolicitAppointment {
    fun solicit(appointment: Appointment)
}
