package com.localhostloco.biwenger.neo4jdemo.services

import com.localhostloco.biwenger.neo4jdemo.domain.models.response.LoginResponse

interface BiwengerService {
    fun login(): LoginResponse
}