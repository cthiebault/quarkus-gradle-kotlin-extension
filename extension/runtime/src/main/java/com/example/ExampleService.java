package com.example;


import jakarta.enterprise.context.ApplicationScoped;

import java.time.Instant;

@ApplicationScoped
public class ExampleService {

    public Instant now() {
        return Instant.now();
    }

}
