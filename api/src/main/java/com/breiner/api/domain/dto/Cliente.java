package com.breiner.api.domain.dto;

import java.util.List;

public class Cliente {

    private Integer idCliente;
    private String firstName;
    private String lastName;
    private String dni;

    private String ciudadResidencia;

    private List<Compra> compras;

    public Cliente() {
    }

    public Cliente(Integer idCliente, String firstName, String lastName, String dni, String ciudadResidencia, List<Compra> compras) {
        this.idCliente = idCliente;
        this.firstName = firstName;
        this.compras = compras;
        this.lastName = lastName;
        this.dni = dni;
        this.ciudadResidencia = ciudadResidencia;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getCiudadResidencia() {
        return ciudadResidencia;
    }

    public void setCiudadResidencia(String ciudadResidencia) {
        this.ciudadResidencia = ciudadResidencia;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public void setCompras(List<Compra> compras) {
        this.compras = compras;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "idCliente=" + idCliente +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dni='" + dni + '\'' +
                ", ciudadResidencia='" + ciudadResidencia + '\'' +
                ", compras=" + compras +
                '}';
    }
}
