package org.example.Entities;

import javax.persistence.*;
import java.io.Serializable;

 @Entity
 @Table(name = "Imagen Promocion")
public class ImagenPromocion implements Serializable {
    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Denominacion")
    private String denominacion;
    //Constructor

     public ImagenPromocion() {
     }

     public ImagenPromocion(String denominacion) {
        this.denominacion = denominacion;
    }
    //Getter y setter

     public Long getId() {
         return id;
     }

     public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

}
