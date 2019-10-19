package com.localhostloco.biwenger.neo4jdemo.domain.models

data class Status(
        val balance: Integer,
        val bids: Integer,
        val offers: Integer,
        val points: Integer
)