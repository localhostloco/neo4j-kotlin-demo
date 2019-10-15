package com.localhostloco.biwenger.neo4jdemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class Neo4jdemoApplication

fun main(args: Array<String>) {
    runApplication<Neo4jdemoApplication>(*args)
}
