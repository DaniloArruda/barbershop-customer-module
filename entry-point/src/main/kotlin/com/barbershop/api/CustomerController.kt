package com.barbershop.api

import com.barbershop.api.dto.AppointmentSolicitationDTO
import com.barbershop.use_case.appointment_solicited.AppointmentSolicitedRequest
import com.barbershop.use_case.appointment_solicited.AppointmentSolicitedUseCase
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class CustomerController {

    @Autowired
    lateinit var appointmentSolicitedUseCase: AppointmentSolicitedUseCase

    @PostMapping("/solicit-appointment")
    fun solicitAppointment(@RequestBody appointmentSolicitationDTO: AppointmentSolicitationDTO) {
        val appointmentSolicitedRequest = AppointmentSolicitedRequest()

        appointmentSolicitedUseCase.execute(appointmentSolicitedRequest)
    }
}
