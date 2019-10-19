package com.localhostloco.biwenger.neo4jdemo.services.impl

import com.localhostloco.biwenger.neo4jdemo.domain.enums.BaseUrlEnum
import com.localhostloco.biwenger.neo4jdemo.domain.enums.RequestEndpointsEnum
import com.localhostloco.biwenger.neo4jdemo.domain.models.request.LoginRequest
import com.localhostloco.biwenger.neo4jdemo.domain.models.response.LoginResponse
import com.localhostloco.biwenger.neo4jdemo.services.BiwengerService
import mu.KotlinLogging
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.beans.factory.annotation.Value
import org.springframework.http.HttpEntity
import org.springframework.http.HttpHeaders
import org.springframework.http.ResponseEntity
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate
import org.springframework.web.client.postForEntity


@Service
class BiwengerServiceImpl : BiwengerService {
    private val logger = KotlinLogging.logger {}

    @Value("\${biwenger.credentials.email}")
    lateinit var email: String

    @Value("\${biwenger.credentials.password}")
    lateinit var password: String

    @Autowired
    @Qualifier("login")
    lateinit var headers: HttpHeaders

    override fun login(): LoginResponse {
        var body = LoginRequest(email, password)
        var url: String = BaseUrlEnum.AUTH.url.plus(RequestEndpointsEnum.LOGIN.url)
        var entity = HttpEntity(body, headers)
        logger.info(entity.toString())
        var restTemplate: RestTemplate = RestTemplate(HttpComponentsClientHttpRequestFactory())
        var result: ResponseEntity<LoginResponse> = restTemplate.postForEntity(url = url, request = entity)
        var token = result.body
        return token!!
    }

}