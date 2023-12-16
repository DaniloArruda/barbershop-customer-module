package com.barbershop.customermodule

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CustomerModuleApplication

fun main(args: Array<String>) {
	runApplication<CustomerModuleApplication>(*args)
}
