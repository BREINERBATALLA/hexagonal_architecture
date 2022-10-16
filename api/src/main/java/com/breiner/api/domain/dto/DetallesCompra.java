package com.breiner.api.domain.dto;


public class DetallesCompra {
    private Producto producto;
    private Compra compra;
    private Integer cantidadProducto;
    private double totalCompra;

    public DetallesCompra() {
    }

    public DetallesCompra( Producto producto, Compra compra, Integer cantidadProducto, double totalCompra) {
        this.producto = producto;
        this.compra = compra;
        this.cantidadProducto = cantidadProducto;
        this.totalCompra = totalCompra;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public Integer getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(Integer cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public double getTotalCompra() {
        return totalCompra;
    }

    public void setTotalCompra(double totalCompra) {
        this.totalCompra = totalCompra;
    }
}
