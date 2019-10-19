package com.localhostloco.biwenger.neo4jdemo.controllers

import com.localhostloco.biwenger.neo4jdemo.services.BiwengerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class InternalController {

    @Autowired
    private lateinit var biwengerService: BiwengerService

    @GetMapping("/login")
    fun getToken(): Any {
        return biwengerService.login()!!
    }
}