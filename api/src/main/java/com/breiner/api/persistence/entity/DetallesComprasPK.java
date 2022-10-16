package com.breiner.api.persistence.entity;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
public class DetallesComprasPK implements Serializable{

    @ManyToOne
    @JoinColumn(name = "id_compra",nullable = false)
    private CompraEntidad compra;

    @ManyToOne
    @JoinColumn(name = "id_producto",nullable = false)
    private ProductoEntidad producto;

}
