package org.example.Entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "unidades_medidas")
public class UnidadMedida implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String denominacion;

    //Constructor
    public UnidadMedida(String denominacion) {
        this.denominacion = denominacion;
    }

    //Getter and setter
    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

}
