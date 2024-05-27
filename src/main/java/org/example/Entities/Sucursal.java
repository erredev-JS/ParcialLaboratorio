package org.example.Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Sucursal")
public class Sucursal implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    // Atributos
    private String nombre;
    private LocalTime horarioApertura;
    private LocalTime horarioCierre;
    private Boolean casaMatriz;

    // Relacion
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_domicilio")
    private Domicilio domicilioSucursal;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "fk_empresaCentral")
    private Empresa empresaCentral;
    @ManyToMany
    @JoinTable(name = "sucursal_promos", joinColumns = @JoinColumn(name = "sucursal"),inverseJoinColumns = @JoinColumn(name = "promos"))
    private List<Promocion> promos;
    /*
    @ManyToMany
    @JoinTable(name = "sucursal_promos", joinColumns = @JoinColumn(name = "sucursal"),inverseJoinColumns = @JoinColumn(name = "promos"))
    private List<Categoria> categorias;
    */

    // Constructores

    public Sucursal(String nombre, LocalTime horarioApertura, LocalTime horarioCierre, Boolean casaMatriz, Domicilio domicilioSucursal, Empresa empresaCentral) {
        this.nombre = nombre;
        this.horarioApertura = horarioApertura;
        this.horarioCierre = horarioCierre;
        this.casaMatriz = casaMatriz;
        this.domicilioSucursal = domicilioSucursal;
        this.empresaCentral = empresaCentral;
        this.promos = new ArrayList<>();
    }

    //Getter and Setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalTime getHorarioApertura() {
        return horarioApertura;
    }

    public void setHorarioApertura(LocalTime horarioApertura) {
        this.horarioApertura = horarioApertura;
    }

    public Boolean getCasaMatriz() {
        return casaMatriz;
    }

    public void setCasaMatriz(Boolean casaMatriz) {
        this.casaMatriz = casaMatriz;
    }

    public LocalTime getHorarioCierre() {
        return horarioCierre;
    }

    public void setHorarioCierre(LocalTime horarioCierre) {
        this.horarioCierre = horarioCierre;
    }

    public Domicilio getDomicilioSucursal() {
        return domicilioSucursal;
    }

    public void setDomicilioSucursal(Domicilio domicilioSucursal) {
        this.domicilioSucursal = domicilioSucursal;
    }

    public Empresa getEmpresaCentral() {
        return empresaCentral;
    }

    public void setEmpresaCentral(Empresa empresaCentral) {
        this.empresaCentral = empresaCentral;
    }

    public List<Promocion> getPromos() {
        return promos;
    }

    public void setPromos(List<Promocion> promos) {
        this.promos = promos;
    }
}
