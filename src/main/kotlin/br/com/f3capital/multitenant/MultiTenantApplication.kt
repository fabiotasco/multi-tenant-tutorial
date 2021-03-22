package br.com.f3capital.multitenant

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MultiTenantApplication

fun main(args: Array<String>) {
    runApplication<MultiTenantApplication>(*args)
}
