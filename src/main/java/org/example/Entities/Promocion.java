package org.example.Entities;

import org.example.Entities.enums.TipoPromocion;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name="Promocion")
public class Promocion implements Serializable {
    //Atributos

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="Denominacion")
    private String denominacion;
    @Column(name="FechaDesde")
    private LocalDate FechaDesde;
    @Column(name="FechaHasta")
    private LocalDate FechaHasta;
    @Column(name="HoraDesde")
    private LocalTime HoraDesde;
    @Column(name="HoraHasta")
    private LocalTime HoraHasta;
    @Column(name="DescripcionDescuento")
    private String descripcionDescuento;
    @Column(name="PrecioPromocional")
    private Double precioPromocional;
    @Column(name = "TipoPromocion")
    private TipoPromocion tipoPromocion;
    // Relacion
    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
    private List<PromocionDetalle> promocionDetalle;

    // Constructores

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

    public Promocion(String denominacion, LocalDate fechaDesde, LocalDate fechaHasta, LocalTime horaDesde, LocalTime horaHasta, String descripcionDescuento, Double precioPromocional, TipoPromocion tipoPromocion, List<PromocionDetalle> promocionDetalle) {
        this.denominacion = denominacion;
        FechaDesde = fechaDesde;
        FechaHasta = fechaHasta;
        HoraDesde = horaDesde;
        HoraHasta = horaHasta;
        this.descripcionDescuento = descripcionDescuento;
        this.precioPromocional = precioPromocional;
        this.tipoPromocion = tipoPromocion;
        this.promocionDetalle = promocionDetalle;
    }

    //Getter y setter

    public Long getId() {
        return id;
    }

    public  List<PromocionDetalle> getPromocionDetalle(){
        return this.promocionDetalle;
    }

    public void setPromocionDetalle( List<PromocionDetalle> promocionDetalle) {
        this.promocionDetalle = promocionDetalle;
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
