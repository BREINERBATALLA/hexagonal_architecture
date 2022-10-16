package com.breiner.api.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="productos")
@Entity
public class ProductoEntidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProducto;

    private String descripcion;

    private Double precioUnitario;

    private Integer stock;

    private String urlImagen;

    @OneToMany(mappedBy = "producto")
    private List<DetallesCompraEntidad> detallesCompraEntidad;

}
