package com.breiner.api.domain.dto;

import java.time.LocalDate;

public class Compra {

    private Integer idCompra;
    private Cliente cliente;
    private LocalDate fecha;

    public Compra() {
    }

    public Compra(Integer idCompra, Cliente cliente, LocalDate fecha) {
        this.idCompra = idCompra;
        this.cliente = cliente;
        this.fecha = fecha;
    }

    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
