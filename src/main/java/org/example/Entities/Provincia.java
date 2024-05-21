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

    // Relaciones

    private Pais pais;

    // Constructores

    public Provincia(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

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

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
}
