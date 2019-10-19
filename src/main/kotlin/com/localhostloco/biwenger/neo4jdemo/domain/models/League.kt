package com.localhostloco.biwenger.neo4jdemo.domain.models

import org.springframework.lang.Nullable

data class League(
        val competition: String?,
        val created: Int?,
        val icon: String?,
        @Nullable val id: Int?,
        val mode: String?,
        val name: String?,
        val scoreID: Int?,
        val settings: Settings?,
        val type: String?,
        val upgrades: Upgrades?,
        val user: User?
)