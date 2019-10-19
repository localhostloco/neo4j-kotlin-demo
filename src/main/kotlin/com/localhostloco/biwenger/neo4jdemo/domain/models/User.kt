package com.localhostloco.biwenger.neo4jdemo.domain.models

import org.springframework.lang.Nullable

data class User(
        val favorites: List<Any>?,
        val group: String?,
        val icon: String?,
        @Nullable val id: Int?,
        val name: String?,
        val position: Int?,
        val status: Status?,
        val type: String?,
        val upgrades: Upgrades?
)