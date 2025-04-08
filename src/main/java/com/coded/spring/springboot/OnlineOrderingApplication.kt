package com.coded.spring.springboot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class OnlineOrderingApplication

fun main(args: Array<String>) {
    runApplication<OnlineOrderingApplication>(*args)
}