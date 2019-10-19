package com.localhostloco.biwenger.neo4jdemo.domain.models

data class Settings(
        val balance: String,
        val challengesAllow: Int,
        val clause: String,
        val clauseIncrement: Int,
        val favoritesAllow: Boolean,
        val immediateSales: Int,
        val lineupAllowExtra: Boolean,
        val lineupCaptain: Int,
        val lineupCaptainMaxValue: Int,
        val lineupCaptainPositions: Int,
        val lineupReserves: Boolean,
        val lineupRoundChanges: Int,
        val lineupStrategies: List<String>,
        val loans: String,
        val loansMaxRounds: Int,
        val loansMinRounds: Int,
        val marketShowBids: Int,
        val maxPurchasePrice: Int,
        val onlyAdminPosts: Int,
        val privacy: String,
        val roundDelayed: String,
        val secret: String,
        val userOffers: String
)