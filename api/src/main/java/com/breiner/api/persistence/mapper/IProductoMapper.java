package com.breiner.api.persistence.mapper;

import com.breiner.api.domain.dto.Producto;
import com.breiner.api.persistence.entity.ProductoEntidad;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public interface IProductoMapper {

    @Mappings({@Mapping(source = "idProducto" ,target = "idProducto"),
                @Mapping(source = "descripcion" ,target = "descripcion"),
                @Mapping(source = "precioUnitario" ,target = "precioUnitario"),
                @Mapping(source = "stock" ,target = "stock"),
                @Mapping(source = "urlImagen" ,target = "urlImagen")})
    Producto toProducto(ProductoEntidad productoEntidad);

    @InheritInverseConfiguration
    @Mapping(target = "detallesCompraEntidad",ignore = true)
    ProductoEntidad toProductoEntidad(Producto producto);
}
