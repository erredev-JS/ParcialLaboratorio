package org.example.Entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "detalles_de_promocion")
public class PromocionDetalle implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int cantidad;

    // Relaciones
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "fk_articulo")
    private Articulo articulo;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "fk_promocion")
    private Promocion promocion;

    //Constructor
    public PromocionDetalle() {
    }

    public PromocionDetalle(int cantidad, Articulo articulo, Promocion promocion) {
        this.cantidad = cantidad;
        this.articulo = articulo;
        this.promocion = promocion;
    }

    //Getter and Settter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public Promocion getPromocion() {
        return promocion;
    }

    public void setPromocion(Promocion promocion) {
        this.promocion = promocion;
    }
}
