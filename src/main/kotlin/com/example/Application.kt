package com.example

import com.example.plugins.configureHTTP
import com.example.routes.makeRouting
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*

/**
 * Start the server
 */
fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0", module = Application::module).start(wait = true)
}

/**
 * Application modules
 */
fun Application.module() {
    makeRouting()
    configureHTTP()

}
