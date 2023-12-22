package com.barbershop

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EntryPointApplication

fun main(args: Array<String>) {
    runApplication<EntryPointApplication>(*args)
}