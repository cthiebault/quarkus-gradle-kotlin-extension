package com.example.application;

import io.quarkus.test.common.http.TestHTTPEndpoint;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.*;

@QuarkusTest
@TestHTTPEndpoint(ExampleResource.class)
class ExampleResourceTest {

    @Test
    void testGet() {
        when().get()
                .then().statusCode(200)
                .body(is(not(emptyString())));
    }

}