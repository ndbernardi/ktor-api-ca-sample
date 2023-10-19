package com.example.routes

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

    private var PATH = "/"

    fun Application.indexRoutes() {
        routing {
            getIndex()
            postIndex()
        }
    }

    /**
     * Index route
     */
    fun Route.getIndex() {
        get(PATH) {
            call.respondText("Index!")
        }
    }

    fun Route.postIndex() {
        post(PATH) {
            call.respond(HttpStatusCode.Forbidden, "Invalid call")
        }
}
