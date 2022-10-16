package com.breiner.apirest.controllers;


import com.breiner.apirest.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectionController {

    @Qualifier("propertyServiceImpl")
    @Autowired
    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.greeting();
    }

}
