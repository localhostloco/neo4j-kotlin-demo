package com.localhostloco.biwenger.neo4jdemo.domain.models

import org.springframework.lang.Nullable

data class Account(
        val created: Int?,
        val credits: Int?,
        val devices: List<String>?,
        val email: String?,
        @Nullable val id: Int?,
        val locale: String?,
        val name: String?,
        val newsletter: Boolean?,
        val status: String?,
        val unreadMessages: Boolean?
)