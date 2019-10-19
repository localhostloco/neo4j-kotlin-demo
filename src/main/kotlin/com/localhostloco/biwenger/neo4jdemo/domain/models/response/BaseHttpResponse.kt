package com.localhostloco.biwenger.neo4jdemo.domain.models.response

data class BaseHttpResponse(
        val data: AccountResponse,
        val status: Int
)
