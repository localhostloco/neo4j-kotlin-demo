package com.localhostloco.biwenger.neo4jdemo.domain.enums

enum class BaseUrlEnum(val url: String) {
    AUTH("https://biwenger.as.com/api/v2/"),
    NO_AUTH("https://cf.biwenger.com/api/v2/");
}