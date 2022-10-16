package com.breiner.apirest.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyServiceImpl implements GreetingService {
    @Override
    public String greeting() {
        return "Greeting to all from property";
    }
}
