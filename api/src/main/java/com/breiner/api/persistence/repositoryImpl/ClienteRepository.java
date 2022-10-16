package com.breiner.api.persistence.repositoryImpl;

import com.breiner.api.domain.dto.Cliente;
import com.breiner.api.domain.repository.IClienteRepository;
import com.breiner.api.persistence.crud.IClienteCrudRepository;
import com.breiner.api.persistence.entity.ClienteEntidad;
import com.breiner.api.persistence.mapper.IClienteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ClienteRepository implements IClienteRepository {

    @Autowired
    IClienteCrudRepository clienteCrudRepository;

    @Autowired
    IClienteMapper clienteMapper;
    @Override
    public List<Cliente> getAll() {
        return clienteMapper.toClientes((List<ClienteEntidad>)clienteCrudRepository.findAll());
    }

    @Override
    public Optional<Cliente> get(Integer id) {
        return clienteCrudRepository.findById(id).map(clienteEntidad -> clienteMapper.toCliente(clienteEntidad));
    }

    @Override
    public void delete(Integer id) {
        clienteCrudRepository.deleteById(id);
    }

    @Override
    public Cliente save(Cliente cliente) {
        System.out.println(cliente.toString());
        System.out.println("Entra");
        System.out.println("Entro");
        ClienteEntidad clienteEntidad= clienteMapper.toClienteEntidad(cliente);
        System.out.println(clienteEntidad.toString());
         return clienteMapper.toCliente(clienteCrudRepository.save(clienteEntidad));
    }

    @Override
    public void update(Cliente cliente) {
        ClienteEntidad clienteEntidad= clienteMapper.toClienteEntidad(cliente);
        clienteCrudRepository.save(clienteEntidad);
    }
}
