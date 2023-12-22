package com.barbershop.configuration

import com.barbershop.producer.SolicitAppointmentKafka
import com.barbershop.repository.SaveAppointmentRepository
import com.barbershop.use_case.appointment_solicited.AppointmentSolicitedUseCase
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class UseCaseConfiguration {

    @Bean
    fun appointmentSolicitedUseCase(): AppointmentSolicitedUseCase {
        return AppointmentSolicitedUseCase(
            solicitAppointment = SolicitAppointmentKafka(),
            saveAppointment =  SaveAppointmentRepository(),
        )
    }
}