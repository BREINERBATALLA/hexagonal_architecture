package com.breiner.apirest.controllers;

import com.breiner.apirest.services.ConstructorServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectionControllerTest {

    ConstructorInjectionController constructorInjectionController;

    @BeforeEach
    void setUp() {
        constructorInjectionController= new ConstructorInjectionController(new ConstructorServiceImpl());

    }

    @Test
    void getGreeting() {
        System.out.println(constructorInjectionController.getGreeting());
    }
}