package org.example.Entities;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "Provincia")
public class Provincia implements Serializable {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)

    private Long id;

    // Atributos

    private String nombre;

    // Constructores

    public Provincia(String nombre) {
        this.nombre = nombre;
    }

    // Getter´s and Setter´s

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
