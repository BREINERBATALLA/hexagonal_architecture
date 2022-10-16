package com.breiner.api.persistence.mapper;

import com.breiner.api.domain.dto.Compra;
import com.breiner.api.persistence.entity.CompraEntidad;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public interface ICompraMapper {

    @Mappings({@Mapping(source = "idCompra",target = "idCompra"),
               @Mapping(source = "cliente" ,target = "cliente"),
               @Mapping(source = "fecha",target ="fecha" )
                })
    Compra toCompra(CompraEntidad compraEntidad);

    @InheritInverseConfiguration
    @Mapping(target = "detallesCompra",ignore = true)
    CompraEntidad toCompraEntidad(Compra compra);

}
