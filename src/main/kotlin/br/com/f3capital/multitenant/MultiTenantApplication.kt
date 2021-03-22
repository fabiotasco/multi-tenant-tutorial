package br.com.f3capital.multitenant

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

/**
 * @see https://www.north-47.com/knowledge-base/multitenancy-with-spring-boot/
 * @see https://bitbucket.org/n47/spring-boot-multitenancy/src/master/
 */
@SpringBootApplication
class MultiTenantApplication

fun main(args: Array<String>) {
    runApplication<MultiTenantApplication>(*args)
}
