package com.localhostloco.biwenger.neo4jdemo.domain.enums

enum class RequestEndpointsEnum(val url: String, val auth: Boolean = true) {
    LOGIN("auth/login"),
    ACCOUNT("account"),
    HOME("home"),
    LEAGUE("league?include=all&fields=*,standings,group,settings(description)"),
    USER("user?fields=*,lineup(type,playersID,captain),players(id,owner),market(*,-userID),offers,-trophies"),
    MARKET("market"),
    ROUNDS("rounds/league"),
    LALIGA("competitions/la-liga/data", auth = false);
}