package org.example.Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@DiscriminatorValue("articulosInsumos")
public class ArticuloInsumo extends Articulo implements Serializable  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Double precioCompra;
    private Integer stockActual;
    private Integer stockMaximo;
    private Boolean esParaElaborar;

    //Constuctor
    public ArticuloInsumo(Double precioVenta, String denominacion, List<ImagenArticulo> imagenArticulo, UnidadMedida unidadMedida, Double precioCompra, Integer stockActual, Integer stockMaximo, Boolean esParaElaborar) {
        super(precioVenta, denominacion, imagenArticulo, unidadMedida);
        this.precioCompra = precioCompra;
        this.stockActual = stockActual;
        this.stockMaximo = stockMaximo;
        this.esParaElaborar = esParaElaborar;
    }

    // Getter and Setter
    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public Double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(Double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public Integer getStockActual() {
        return stockActual;
    }

    public void setStockActual(Integer stockActual) {
        this.stockActual = stockActual;
    }

    public Integer getStockMaximo() {
        return stockMaximo;
    }

    public void setStockMaximo(Integer stockMaximo) {
        this.stockMaximo = stockMaximo;
    }

    public Boolean getEsParaElaborar() {
        return esParaElaborar;
    }

    public void setEsParaElaborar(Boolean esParaElaborar) {
        this.esParaElaborar = esParaElaborar;
    }
}
