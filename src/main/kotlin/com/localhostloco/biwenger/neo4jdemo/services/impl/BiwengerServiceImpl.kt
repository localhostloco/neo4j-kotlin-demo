package com.localhostloco.biwenger.neo4jdemo.services.impl

import com.google.gson.Gson
import com.localhostloco.biwenger.neo4jdemo.domain.enums.BaseUrlEnum
import com.localhostloco.biwenger.neo4jdemo.domain.enums.HeadersEnum
import com.localhostloco.biwenger.neo4jdemo.domain.enums.RequestEndpointsEnum
import com.localhostloco.biwenger.neo4jdemo.domain.models.request.LoginRequest
import com.localhostloco.biwenger.neo4jdemo.domain.models.response.AccountResponse
import com.localhostloco.biwenger.neo4jdemo.domain.models.response.BaseHttpResponse
import com.localhostloco.biwenger.neo4jdemo.domain.models.response.LoginResponse
import com.localhostloco.biwenger.neo4jdemo.services.BiwengerService
import mu.KotlinLogging
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.core.ParameterizedTypeReference
import org.springframework.http.HttpEntity
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpMethod
import org.springframework.http.ResponseEntity
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate
import org.springframework.web.client.postForEntity


@Service
class BiwengerServiceImpl : BiwengerService {

    private val logger = KotlinLogging.logger {}
    private var token: LoginResponse? = null

    @Autowired
    @Qualifier("login")
    lateinit var loginHeaders: HttpHeaders

    @Autowired
    @Qualifier("auth")
    lateinit var authHeaders: HttpHeaders
    var restTemplate: RestTemplate = RestTemplate(HttpComponentsClientHttpRequestFactory())

    override fun login(): LoginResponse {
        var body = LoginRequest(System.getenv("email"), System.getenv("password"))
        var url: String = BaseUrlEnum.AUTH.url.plus(RequestEndpointsEnum.LOGIN.url)
        var entity = HttpEntity(body, loginHeaders)
        logger.info(entity.toString())
        var result: ResponseEntity<LoginResponse> = restTemplate.postForEntity(url = url, request = entity)
        token = result.body
        logger.info(token.toString())
        return token!!
    }

    override fun account(): AccountResponse {
        token ?: login()
        authHeaders.set(HeadersEnum.AUTHORIZATION.header, "Bearer ".plus(token?.token))
        var url = BaseUrlEnum.AUTH.url.plus(RequestEndpointsEnum.ACCOUNT.url)
        var respType = object : ParameterizedTypeReference<String>() {}
        var entity = HttpEntity<String>(authHeaders)
        logger.info { entity.toString() }
        var result: ResponseEntity<String> = restTemplate.exchange(
                url,
                HttpMethod.GET,
                entity,
                respType)
        logger.info { result }
        return Gson().fromJson(result.body, BaseHttpResponse::class.java).data
    }
}