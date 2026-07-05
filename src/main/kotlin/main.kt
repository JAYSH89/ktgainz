package nl.jaysh

import io.ktor.server.application.*
import nl.jaysh.plugins.configureExposed
import nl.jaysh.plugins.configureHttp
import nl.jaysh.plugins.configureKoin
import nl.jaysh.plugins.configurePostgres
import nl.jaysh.plugins.configureRouting
import nl.jaysh.plugins.configureSerialization

fun main(args: Array<String>) = io.ktor.server.netty.EngineMain.main(args)

suspend fun Application.module() {
    configureHttp()
    configureSerialization()
    configurePostgres()
    configureExposed()
    configureKoin()
    configureRouting()
}
