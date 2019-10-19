package com.localhostloco.biwenger.neo4jdemo.domain.models

data class Status(
        val balance: Int,
        val bids: Int,
        val offers: Int,
        val points: Int
)