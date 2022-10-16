package com.breiner.api.config;

import com.breiner.api.domain.repository.IClienteRepository;
import com.breiner.api.domain.service.ClienteService;
import com.breiner.api.persistence.repositoryImpl.ClienteRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public IClienteRepository iClienteRepository(){
        return new ClienteRepository(); //impl of IClienteRepository
    }

    @Bean
    public ClienteService clienteService(){
        return new ClienteService(iClienteRepository()); //Inject by constructor
    }
}
