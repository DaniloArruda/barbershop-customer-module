package com.barbershop.use_case.appointment_solicited

import org.junit.jupiter.api.Test
import org.mockito.kotlin.any
import org.mockito.kotlin.mock
import org.mockito.kotlin.verify

class AppointmentSolicitedUseCaseTest {

    @Test
    fun shouldSolicitAppointmentWithSuccess() {
        // given
        val solicitAppointment = mock<SolicitAppointment>()
        val saveAppointment = mock<SaveAppointment>()
        val appointmentSolicitedUseCase = AppointmentSolicitedUseCase(
                solicitAppointment = solicitAppointment,
                saveAppointment = saveAppointment,
        )

        val appointmentRequest = AppointmentSolicitedRequest()

        // when
        appointmentSolicitedUseCase.execute(appointmentRequest)

        // then
        verify(solicitAppointment).solicit(any())
        verify(saveAppointment).save(any())
    }
}