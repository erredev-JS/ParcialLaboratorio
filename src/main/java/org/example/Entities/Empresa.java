package org.example.Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;

@Entity
@Table(name = "Empresa")
public class Empresa implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

    // Atributos

    private String nombre;
    private String razonSocial;

    private Integer cuil;

    // NO SE

    // private ArrayList<Sucursal> sucursalArrayList = new ArrayList<Sucursal>();

    //  Constructores

    public Empresa(String nombre, String razonSocial, Integer cuil) {
        this.nombre = nombre;
        this.razonSocial = razonSocial;
        this.cuil = cuil;
    }


    // Getter´s and Setter´s
    public Long getId(){
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public Integer getCuil() {
        return cuil;
    }

    public void setCuil(Integer cuil) {
        this.cuil = cuil;
    }


    // Metodos

    /*
    public void agregarSucursal(Sucursal sucursal){
        sucursalArrayList.add(sucursal);
    }
    */
}
