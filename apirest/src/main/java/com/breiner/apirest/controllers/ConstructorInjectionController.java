package com.breiner.apirest.controllers;


import com.breiner.apirest.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectionController {


    private final GreetingService greetingService; //luego que lo pasamos por el constructor no lo podemos cambiar

    public ConstructorInjectionController(GreetingService greetingService){
        this.greetingService =greetingService;
    }

    public String getGreeting() {
        return greetingService.greeting();
    }

}
