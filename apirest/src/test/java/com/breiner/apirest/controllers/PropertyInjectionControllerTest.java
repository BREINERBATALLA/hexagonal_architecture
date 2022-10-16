package com.breiner.apirest.controllers;

import com.breiner.apirest.services.PropertyServiceImpl;
import com.breiner.apirest.services.PropertyServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectionControllerTest {

    PropertyInjectionController controller;

    @BeforeEach
    void setUp() {
        controller= new PropertyInjectionController();
        controller.greetingService= new PropertyServiceImpl(); //inyecto la implementación(dependencia)
        //inyectar por medio de una propiedad no tiene sentido!!, porque debe ser pública
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}