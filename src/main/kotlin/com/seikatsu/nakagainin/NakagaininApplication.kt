package com.seikatsu.nakagainin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class NakagaininApplication

fun main(args: Array<String>) {
    runApplication<NakagaininApplication>(*args)
}
