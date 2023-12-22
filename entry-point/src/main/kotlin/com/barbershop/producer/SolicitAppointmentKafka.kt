package com.barbershop.producer

import com.barbershop.model.Appointment
import com.barbershop.use_case.appointment_solicited.SolicitAppointment
import org.springframework.stereotype.Component

@Component
class SolicitAppointmentKafka: SolicitAppointment {
    override fun solicit(appointment: Appointment) {
        println("appointment solicited; appointment_id: ${appointment.id}")
    }
}