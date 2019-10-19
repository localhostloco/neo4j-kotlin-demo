package com.localhostloco.biwenger.neo4jdemo.util

import com.localhostloco.biwenger.neo4jdemo.domain.enums.HeadersEnum
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.HttpHeaders

@Configuration
class RequestHeadersBuilder {

    @Value("\${biwenger.headers.host}")
    lateinit var host: String
    @Value("\${biwenger.headers.accept}")
    lateinit var accept: String
    @Value("\${biwenger.headers.accept-encoding}")
    lateinit var accept_encoding: String
    @Value("\${biwenger.headers.accept-language}")
    lateinit var accept_language: String
    @Value("\${biwenger.headers.authority}")
    lateinit var authority: String
    @Value("\${biwenger.headers.cache-control}")
    lateinit var cache_control: String
    @Value("\${biwenger.headers.connection}")
    lateinit var connection: String
    @Value("\${biwenger.headers.content-length}")
    lateinit var content_length: String
    @Value("\${biwenger.headers.content-type}")
    lateinit var content_type: String
    @Value("\${biwenger.headers.cookie}")
    lateinit var cookie: String
    @Value("\${biwenger.headers.dnt}")
    lateinit var dnt: String
    @Value("\${biwenger.headers.method}")
    lateinit var method: String
    @Value("\${biwenger.headers.origin}")
    lateinit var origin: String
    @Value("\${biwenger.headers.path}")
    lateinit var path: String
    @Value("\${biwenger.headers.referer}")
    lateinit var referer: String
    @Value("\${biwenger.headers.scheme}")
    lateinit var scheme: String
    @Value("\${biwenger.headers.sec-fetch-mode}")
    lateinit var sec_fetch_mode: String
    @Value("\${biwenger.headers.sec-fetch-site}")
    lateinit var sec_fetch_site: String
    @Value("\${biwenger.headers.user-agent}")
    lateinit var user_agent: String
    @Value("\${biwenger.headers.x-lang}")
    lateinit var x_lang: String
    @Value("\${biwenger.headers.x-version}")
    lateinit var x_version: String

    @Bean("login")
    fun buildLoginHeaders(): HttpHeaders {
        var headers = HttpHeaders()
        headers.add(HeadersEnum.ACCEPT.header, accept)
        headers.add(HeadersEnum.ACCEPT_ENCONDING.header, accept_encoding)
        headers.add(HeadersEnum.ACCEPT_LANGUAGE.header, accept_language)
        headers.add(HeadersEnum.AUTHORITY.header, authority)
        headers.add(HeadersEnum.CACHE_CONTROL.header, cache_control)
        headers.add(HeadersEnum.CONNECTION.header, connection)
        headers.add(HeadersEnum.CONTENT_TYPE.header, content_type)
        headers.add(HeadersEnum.DNT.header, dnt)
        headers.add(HeadersEnum.HOST.header, host)
        headers.add(HeadersEnum.METHOD.header, method)
        headers.add(HeadersEnum.ORIGIN.header, origin)
        headers.add(HeadersEnum.REFERER.header, referer)
        headers.add(HeadersEnum.SCHEME.header, scheme)
        headers.add(HeadersEnum.SEC_FETCH_MODE.header, sec_fetch_mode)
        headers.add(HeadersEnum.SEC_FETCH_SITE.header, sec_fetch_site)
        headers.add(HeadersEnum.USER_AGENT.header, user_agent)
        headers.add(HeadersEnum.X_LANG.header, x_lang)
        headers.add(HeadersEnum.X_VERSION.header, x_version)
        return headers
    }

}
