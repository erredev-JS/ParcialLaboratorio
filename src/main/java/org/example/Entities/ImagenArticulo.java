package org.example.Entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "imagenes_articulos")
public class ImagenArticulo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String denominacion;

    //Constructor
    public ImagenArticulo(String denominacion) {
        this.denominacion = denominacion;
    }

    //Getter and Setter
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
