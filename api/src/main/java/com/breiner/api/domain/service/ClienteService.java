package com.breiner.api.domain.service;

import com.breiner.api.domain.dto.Cliente;
import com.breiner.api.domain.repository.IClienteRepository;

import java.util.List;
import java.util.Optional;

public class ClienteService {

    private IClienteRepository clienteRepository;

    public ClienteService(IClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<Cliente> getAll(){
        return clienteRepository.getAll();
    }

    public Optional<Cliente> get(Integer idCliente){
        return clienteRepository.get(idCliente);
    }

    public Cliente save(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public void delete(Integer id){
        clienteRepository.delete(id);
    }

    public void update(Cliente cliente){
       clienteRepository.update(cliente);
    }
}
