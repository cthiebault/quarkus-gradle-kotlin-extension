package com.example.application

import io.quarkus.test.common.http.TestHTTPEndpoint
import io.quarkus.test.junit.QuarkusTest
import io.restassured.RestAssured
import org.hamcrest.Matchers
import org.junit.jupiter.api.Test

@QuarkusTest
@TestHTTPEndpoint(ExampleResource::class)
internal class ExampleResourceTest {
  @Test
  fun testGet() {
    RestAssured.`when`().get()
      .then().statusCode(200)
      .body(Matchers.`is`(Matchers.not(Matchers.emptyString())))
  }
}