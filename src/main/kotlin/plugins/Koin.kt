package nl.jaysh.plugins

import io.ktor.server.application.*
import nl.jaysh.HelloService
import org.koin.dsl.module
import org.koin.ktor.plugin.Koin
import org.koin.logger.slf4jLogger

fun Application.configureKoin() {
    install(Koin) {
        slf4jLogger()
        modules(
            module {
                single<HelloService> {
                    HelloService {
                        println(environment.log.info("Hello, World!"))
                    }
                }
            }
        )
    }
}
