package com.example;


import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

@Dependent
public class ExampleService {

    @Inject
    EntityManager em;

    public void persistEntity(String name) {
        em.persist(new ExampleEntity(name));
    }
}
