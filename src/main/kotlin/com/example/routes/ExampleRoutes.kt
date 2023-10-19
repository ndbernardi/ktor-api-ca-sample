package com.example.routes

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

    private var PATH = "/example"

    fun Application.exampleRoutes() {
        routing {
            getExample()
            postExample()
        }
    }

    /**
     * Index route
     */
    fun Route.getExample() {
        get(PATH) {
            call.respondText("Index!")
        }
    }

    fun Route.postExample() {
        post(PATH) {
            call.respond(HttpStatusCode.Forbidden, "Invalid call")
        }
}
