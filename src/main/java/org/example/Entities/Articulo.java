package org.example.Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)
public abstract class Articulo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    protected String denominacion;
    protected Double precioVenta;

    //Relaciones
    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH})
    @JoinColumn(name = "fk_imagenArticulo")
    private List<ImagenArticulo> imagenArticulo = new ArrayList<>();
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "fk_unidadMedida")
    private UnidadMedida unidadMedida;

    //Constructor

    public Articulo(Double precioVenta, String denominacion, List<ImagenArticulo> imagenArticulo, UnidadMedida unidadMedida) {
        this.precioVenta = precioVenta;
        this.denominacion = denominacion;
        this.imagenArticulo = imagenArticulo;
        this.unidadMedida = unidadMedida;
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

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public List<ImagenArticulo> getImagenArticulo() {
        return imagenArticulo;
    }

    public void setImagenArticulo(List<ImagenArticulo> imagenArticulo) {
        this.imagenArticulo = imagenArticulo;
    }

    public UnidadMedida getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(UnidadMedida unidadMedida) {
        this.unidadMedida = unidadMedida;
    }
}
