package com.breiner.api.persistence.mapper;

import com.breiner.api.domain.dto.Cliente;
import com.breiner.api.persistence.entity.ClienteEntidad;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IClienteMapper {

    Cliente toCliente(ClienteEntidad clienteEntidad);

    List<Cliente> toClientes(List<ClienteEntidad> clienteEntidadList);

    @InheritInverseConfiguration
    @Mapping(target = "compraEntidadLista", ignore = true)
    ClienteEntidad toClienteEntidad(Cliente cliente);
}
