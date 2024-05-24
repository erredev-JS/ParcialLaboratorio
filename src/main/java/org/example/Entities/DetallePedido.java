package org.example.Entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "DetallePedidos")
public class DetallePedido implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    // Atributos

    private Integer cantidad;
    private Double subTotal;

    //Relaciones
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_pedido")
    private Pedido pedido;

    // Constructores

    public DetallePedido(Integer cantidad, Double subTotal) {
        this.cantidad = cantidad;
        this.subTotal = subTotal;
    }

    public DetallePedido(Integer cantidad, Double subTotal, Pedido pedido) {
        this.cantidad = cantidad;
        this.subTotal = subTotal;
        this.pedido = pedido;
    }

    // Getter´s and Setter´s
    public Long getId() {
        return id;
    }
    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

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
}
