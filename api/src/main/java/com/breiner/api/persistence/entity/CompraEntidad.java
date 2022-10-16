package com.breiner.api.persistence.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name="compras")
@Entity
public class CompraEntidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCompra;

    private LocalDate fecha;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private ClienteEntidad cliente;

    @OneToMany(mappedBy = "compra")
    List<DetallesCompraEntidad> detallesCompra;
}
