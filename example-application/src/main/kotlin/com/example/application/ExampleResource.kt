package com.example.application;

import com.example.ExampleService;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;


@Path("examples")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Transactional
public class ExampleResource {

    @Inject
    ExampleService exampleService;

    @GET
    public Response now() {
        Response response = new Response();
        response.setMessage(exampleService.now().toString());
        return response;
    }

}
