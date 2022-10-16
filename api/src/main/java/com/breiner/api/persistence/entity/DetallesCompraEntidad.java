package com.breiner.api.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name="detallescompras")
@IdClass(DetallesComprasPK.class)
public class DetallesCompraEntidad {

   @Id
   private Integer producto;

   @Id
   private Integer compra;

   private Integer cantidadProducto;

   private double totalCompra;

}
