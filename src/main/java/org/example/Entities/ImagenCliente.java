package org.example.Entities;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "imagen_clientes")
public class ImagenCliente  implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String denominacion;

    //Constructore
    public ImagenCliente(String denominacion) {
        this.denominacion = denominacion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }
}
