package com.breiner.apirest.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class ConstructorServiceImpl implements GreetingService {
    @Override
    public String greeting() {
        return "Greetings for constructor";
    }
}
