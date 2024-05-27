package org.example.Entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "DetallePedidos")
public class DetallePedido implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Atributos

    private Integer cantidad;
    private Double subTotal;

    //Relaciones
    @ManyToOne
    private Pedido pedido;
    @ManyToOne Articulo articulo;

    // Constructores
    public DetallePedido() {
    }

    public DetallePedido(Integer cantidad, Double subTotal, Pedido pedido, Articulo articulo) {
        this.cantidad = cantidad;
        this.subTotal = subTotal;
        this.pedido = pedido;
        this.articulo = articulo;
    }

    //Getter and setter

    public Double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Double subTotal) {
        this.subTotal = subTotal;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
