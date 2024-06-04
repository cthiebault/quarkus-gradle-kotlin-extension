package com.example;

import jakarta.enterprise.context.ApplicationScoped;

import java.time.Instant;

@ApplicationScoped
class ExampleService {

  fun now(): Instant {
    return Instant.now();
  }

}
