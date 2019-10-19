package com.localhostloco.biwenger.neo4jdemo.domain.models

data class Settings(
        val balance: String,
        val challengesAllow: Integer,
        val clause: String,
        val clauseIncrement: Integer,
        val favoritesAllow: Boolean,
        val immediateSales: Integer,
        val lineupAllowExtra: Boolean,
        val lineupCaptain: Integer,
        val lineupCaptainMaxValue: Integer,
        val lineupCaptainPositions: Integer,
        val lineupReserves: Boolean,
        val lineupRoundChanges: Integer,
        val lineupStrategies: List<String>,
        val loans: String,
        val loansMaxRounds: Integer,
        val loansMinRounds: Integer,
        val marketShowBids: Integer,
        val maxPurchasePrice: Integer,
        val onlyAdminPosts: Integer,
        val privacy: String,
        val roundDelayed: String,
        val secret: String,
        val userOffers: String
)