package com.localhostloco.biwenger.neo4jdemo.domain.enums

enum class HeadersEnum(val header: String) {
    ACCEPT("accept"),
    ACCEPT_ENCONDING("accept-encoding"),
    ACCEPT_LANGUAGE("accept-language"),
    AUTHORITY("authority"),
    AUTHORIZATION("authorization"),
    CACHE_CONTROL("Cache-Control"),
    CONNECTION("Connection"),
    CONTENT_LENGTH("content-length"),
    CONTENT_TYPE("content-type"),
    DNT("dnt"),
    HOST("Host"),
    METHOD("method"),
    ORIGIN("origin"),
    PATH("path"),
    REFERER("referer"),
    SCHEME("scheme"),
    SEC_FETCH_MODE("sec-fetch-mode"),
    SEC_FETCH_SITE("sec-fetch-site"),
    USER_AGENT("user-agent"),
    X_LANG("x-lang"),
    X_VERSION("x-version");

    fun getHeaderValue() = "$header"
}