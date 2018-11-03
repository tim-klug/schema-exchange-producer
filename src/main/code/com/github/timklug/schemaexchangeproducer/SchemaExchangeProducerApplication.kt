package com.github.timklug.schemaexchangeproducer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SchemaExchangeProducerApplication

fun main(args: Array<String>) {
  runApplication<SchemaExchangeProducerApplication>(*args)
}
