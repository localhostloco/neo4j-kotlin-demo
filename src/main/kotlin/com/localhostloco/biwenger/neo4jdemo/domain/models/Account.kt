package com.localhostloco.biwenger.neo4jdemo.domain.models

import org.springframework.lang.Nullable

data class Account(
        val created: Integer?,
        val credits: Integer?,
        val devices: List<String>?,
        val email: String?,
        @Nullable val id: Integer?,
        val locale: String?,
        val name: String?,
        val newsletter: Boolean?,
        val status: String?,
        val unreadMessages: Boolean?
)