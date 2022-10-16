package com.breiner.apirest.controllers;

import com.breiner.apirest.services.SetterServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectionControllerTest {

    SetterInjectionController setterInjectionController;


    @BeforeEach
    void setUp() {
        setterInjectionController= new SetterInjectionController();
        SetterServiceImpl setterService= new SetterServiceImpl();
        setterInjectionController.setGreetingService(setterService);
    }

    @Test
    void setGreetingService() {
        System.out.println(setterInjectionController.getGreeting());
    }
}