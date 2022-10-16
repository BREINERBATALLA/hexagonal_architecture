package com.breiner.apirest.services;

import org.springframework.stereotype.Service;

@Service
public class SetterServiceImpl implements GreetingService {
    @Override
    public String greeting() {
        return "From service setter";
    }
}
