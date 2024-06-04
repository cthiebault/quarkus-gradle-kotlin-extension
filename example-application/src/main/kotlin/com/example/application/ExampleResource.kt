package com.example.application

import com.example.ExampleService
import jakarta.inject.Inject
import jakarta.transaction.Transactional
import jakarta.ws.rs.Consumes
import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType

@Path("examples")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Transactional
class ExampleResource @Inject constructor(private val exampleService: ExampleService) {

  @GET
  fun now(): Response {
    val response = Response()
    response.message = exampleService.now().toString()
    return response
  }
}
