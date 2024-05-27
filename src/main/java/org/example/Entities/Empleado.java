package org.example.Entities;

import org.example.Entities.enums.Rol;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;


@Entity
@Table(name = "Empleados")
public class Empleado implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private LocalDate fechaNacimiento;

    @Enumerated
    private Rol rol;
    @OneToOne
    private UsuarioEmpleado usuarioEmpleado;
    @OneToOne
    private ImagenEmpleado imagenEmpleado;
    @ManyToOne
    private Sucursal sucursal;

    //Constructor
    public Empleado() { }

    public Empleado(String nombre, String apellido, String telefono, String email, LocalDate fechaNacimiento, Rol rol, UsuarioEmpleado usuarioEmpleado, ImagenEmpleado imagenEmpleado, Sucursal sucursal) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.rol = rol;
        this.usuarioEmpleado = usuarioEmpleado;
        this.imagenEmpleado = imagenEmpleado;
        this.sucursal = sucursal;
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

    public String getApellidp() {
        return apellido;
    }

    public void setApellidp(String apellidp) {
        this.apellido = apellidp;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public UsuarioEmpleado getUsuarioEmpleado() {
        return usuarioEmpleado;
    }

    public void setUsuarioEmpleado(UsuarioEmpleado usuarioEmpleado) {
        this.usuarioEmpleado = usuarioEmpleado;
    }

    public ImagenEmpleado getImagenEmpleado() {
        return imagenEmpleado;
    }

    public void setImagenEmpleado(ImagenEmpleado imagenEmpleado) {
        this.imagenEmpleado = imagenEmpleado;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }
}
