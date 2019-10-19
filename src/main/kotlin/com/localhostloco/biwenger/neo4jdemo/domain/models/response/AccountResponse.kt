package com.localhostloco.biwenger.neo4jdemo.domain.models.response

import com.localhostloco.biwenger.neo4jdemo.domain.models.Account
import com.localhostloco.biwenger.neo4jdemo.domain.models.League
import com.localhostloco.biwenger.neo4jdemo.domain.models.Location

data class AccountResponse(
        val account: Account,
        val leagues: List<League>,
        val location: Location,
        val version: Int
)