package org.example.Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "categorias")
public class Categoria implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String denominacion;

    // Relaciones
    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH})
    @JoinColumn(name = "fk_categorias") // Define la clave foránea en la tabla categoria
    private List<Categoria> categoriasHija = new ArrayList<>();
    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH})
    @JoinColumn(name = "fk_categoria")//Ver nombre
    private List<Articulo> articulos = new ArrayList<>();

    // Constructores
    public Categoria() {
    }

    public Categoria(String denominacion, List<Categoria> categoriasHija, List<Articulo> articulos) {
        this.denominacion = denominacion;
        this.categoriasHija = categoriasHija;
        this.articulos = articulos;
    }

    // Getter and Setter
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

    public List<Categoria> getCategoriasHija() {
        return categoriasHija;
    }

    public void setCategoriasHija(List<Categoria> categoriasHija) {
        this.categoriasHija = categoriasHija;
    }

    public List<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(List<Articulo> articulos) {
        this.articulos = articulos;
    }
}
