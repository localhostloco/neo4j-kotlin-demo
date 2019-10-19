package com.localhostloco.biwenger.neo4jdemo.domain.models

data class Upgrades(
        val credits: String?,
        val removeAds: String?,
        val premium: List<String>?,
        val ultra: List<String>?,
        val url: String?
)