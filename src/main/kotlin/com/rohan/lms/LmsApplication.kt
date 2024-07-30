package com.rohan.lms

import io.swagger.v3.oas.annotations.OpenAPIDefinition
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@OpenAPIDefinition
@SpringBootApplication
class LmsApplication

fun main(args: Array<String>) {
	runApplication<LmsApplication>(*args)
}
