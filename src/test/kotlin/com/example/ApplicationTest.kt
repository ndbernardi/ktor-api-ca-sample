package com.example

import com.example.routes.makeRouting
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import io.ktor.server.testing.*
import kotlin.test.Test
import kotlin.test.assertEquals

/**
 * Main app test
 */
class ApplicationTest {

    private var INDEX_PATH = "/"

    @Test
    fun testRoot() = testApplication {
        application {
            makeRouting()
        }

        client.get(INDEX_PATH).apply {
            assertEquals(HttpStatusCode.OK, status)
            assertEquals("Index!", bodyAsText())
        }

        client.post(INDEX_PATH).apply {
            assertEquals(HttpStatusCode.Forbidden, status)
        }
    }
}
