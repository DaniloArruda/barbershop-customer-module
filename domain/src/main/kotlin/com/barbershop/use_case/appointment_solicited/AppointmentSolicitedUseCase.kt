package com.barbershop.use_case.appointment_solicited

import com.barbershop.model.Appointment
import org.springframework.stereotype.Service

@Service
class AppointmentSolicitedUseCase (val solicitAppointment: SolicitAppointment, val saveAppointment: SaveAppointment) {
    fun execute(appointmentRequest: AppointmentSolicitedRequest) {
        val appointment = Appointment()

        solicitAppointment.solicit(appointment);
        saveAppointment.save(appointment);
    }
}