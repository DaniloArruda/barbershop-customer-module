package com.barbershop.repository

import com.barbershop.model.Appointment
import com.barbershop.use_case.appointment_solicited.SaveAppointment

class SaveAppointmentRepository: SaveAppointment {
    override fun save(appointment: Appointment) {
        println("appointment saved; appointment_id: ${appointment.id}")
    }
}