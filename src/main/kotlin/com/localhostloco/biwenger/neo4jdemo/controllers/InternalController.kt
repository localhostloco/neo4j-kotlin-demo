package com.localhostloco.biwenger.neo4jdemo.controllers

import com.localhostloco.biwenger.neo4jdemo.domain.models.response.AccountResponse
import com.localhostloco.biwenger.neo4jdemo.domain.models.response.LoginResponse
import com.localhostloco.biwenger.neo4jdemo.services.BiwengerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(produces = [MediaType.APPLICATION_JSON_UTF8_VALUE])
class InternalController {

    @Autowired
    private lateinit var biwengerService: BiwengerService

    @GetMapping("/login")
    fun getToken(): LoginResponse {
        return biwengerService.login()
    }

    @GetMapping("/account")
    fun account(): AccountResponse {
        return biwengerService.account()
    }
}