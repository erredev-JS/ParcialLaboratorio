package org.example.Entities;

import javax.persistence.*;

@Entity
@Table(name = "PromocionDetalle")
public class PromocionDetalle {
    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Cantidad")
    private int cantidad;

    //Constructores

    public PromocionDetalle() {
    }
    public PromocionDetalle(int cantidad) {
        this.cantidad = cantidad;
    }

    //Getter y setter

    public Long getId() {
        return id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
