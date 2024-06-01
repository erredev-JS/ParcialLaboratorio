package org.example.Entities;

import org.example.Entities.enums.TipoPromocion;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name="Promocion")
public class Promocion implements Serializable {
    //Atributos

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="Denominacion")
    private String denominacion;
    @Column(name="Fecha desde")
    private LocalDate FechaDesde;
    @Column(name="Fecha hasta")
    private LocalDate FechaHasta;
    @Column(name="Hora desde")
    private LocalTime HoraDesde;
    @Column(name="Hora hasta")
    private LocalTime HoraHasta;
    @Column(name="Descripcion descuento")
    private String descripcionDescuento;
    @Column(name="Precio promocional")
    private Double precioPromocional;
    @Column(name = "Tipo promocion")
    private TipoPromocion tipoPromocion;

    //Constructores

    public Promocion() {
    }

    public Promocion(String denominacion, LocalDate fechaDesde, LocalDate fechaHasta, LocalTime horaDesde, LocalTime horaHasta, String descripcionDescuento, Double precioPromocional, TipoPromocion tipoPromocion) {
        this.denominacion = denominacion;
        FechaDesde = fechaDesde;
        FechaHasta = fechaHasta;
        HoraDesde = horaDesde;
        HoraHasta = horaHasta;
        this.descripcionDescuento = descripcionDescuento;
        this.precioPromocional = precioPromocional;
        this.tipoPromocion = tipoPromocion;
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

    public LocalDate getFechaDesde() {
        return FechaDesde;
    }

    public void setFechaDesde(LocalDate fechaDesde) {
        FechaDesde = fechaDesde;
    }

    public LocalDate getFechaHasta() {
        return FechaHasta;
    }

    public void setFechaHasta(LocalDate fechaHasta) {
        FechaHasta = fechaHasta;
    }

    public LocalTime getHoraDesde() {
        return HoraDesde;
    }

    public void setHoraDesde(LocalTime horaDesde) {
        HoraDesde = horaDesde;
    }

    public LocalTime getHoraHasta() {
        return HoraHasta;
    }

    public void setHoraHasta(LocalTime horaHasta) {
        HoraHasta = horaHasta;
    }

    public String getDescripcionDescuento() {
        return descripcionDescuento;
    }

    public void setDescripcionDescuento(String descripcionDescuento) {
        this.descripcionDescuento = descripcionDescuento;
    }

    public Double getPrecioPromocional() {
        return precioPromocional;
    }

    public void setPrecioPromocional(Double precioPromocional) {
        this.precioPromocional = precioPromocional;
    }

    public TipoPromocion getTipoPromocion() {
        return tipoPromocion;
    }

    public void setTipoPromocion(TipoPromocion tipoPromocion) {
        this.tipoPromocion = tipoPromocion;
    }
}
