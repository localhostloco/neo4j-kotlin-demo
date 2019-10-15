package com.localhostloco.biwenger.neo4jdemo.data.request.headers

enum class HeadersEnum(header : String) {
    AUTHORITY(":authority"),
    METHOD(":method"),
    PATH(":path"),
    SCHEME(":scheme"),
    ACCEPT("accept"),
    ACCEPT_ENCONDING("accept-encoding"),
    ACCEPT_LANGUAGE("accept-language"),
    CONTENT_LENGTH("content-length"),
    CONTENT_TYPE("content-type"),
    COOKIE("cookie"),
    DNT("dnt"),
    ORIGIN("origin"),
    REFERER("referer"),
    SEC_FETCH_MODE("sec-fetch-mode"),
    USER_AGENT("user-agent"),
    X_LANG("x-lang"),
    X_VERSION("x-version")
}