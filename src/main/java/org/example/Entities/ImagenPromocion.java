package org.example.Entities;

import javax.persistence.*;
import java.io.Serializable;

 @Entity
 @Table(name = "ImagenPromocion")
public class ImagenPromocion implements Serializable {
    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "Denominacion")
    private String denominacion;
    //Relacion
     @ManyToOne(cascade = CascadeType.PERSIST)
     @JoinColumn(name = "fk_promocion")
    private Promocion promocion;
    //Constructor

     public ImagenPromocion() {
     }

     public ImagenPromocion(String denominacion) {
        this.denominacion = denominacion;
    }

     public ImagenPromocion(String denominacion, Promocion promocion) {
         this.denominacion = denominacion;
         this.promocion = promocion;
     }
     //Getter y setter

     public Long getId() {
         return id;
     }

     public Promocion getPromocion() {
         return promocion;
     }

     public void setPromocion(Promocion promocion) {
         this.promocion = promocion;
     }

     public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

}
