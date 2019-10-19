package com.localhostloco.biwenger.neo4jdemo.domain.models.request

data class LoginRequest(
        val email: String,
        val password: String
)