package org.example.Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "Clientes")
public class Cliente implements Serializable {
    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellidp;
    private String telefono;
    private String email;
    private LocalDate fechaNacimiento;

    //Relaciones
    @OneToOne(cascade = CascadeType.ALL)
    private UsuarioCliente usuario;
    @OneToOne(cascade = CascadeType.ALL)
    private ImagenCliente imagenCliente;
    @OneToOne
    private Domicilio domicilio;

    //Constructor
    public Cliente() {
    }

    public Cliente(String nombre, Domicilio domicilio, ImagenCliente imagenCliente, UsuarioCliente usuario, LocalDate fechaNacimiento, String email, String telefono, String apellidp) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.imagenCliente = imagenCliente;
        this.usuario = usuario;
        this.fechaNacimiento = fechaNacimiento;
        this.email = email;
        this.telefono = telefono;
        this.apellidp = apellidp;
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
        return apellidp;
    }

    public void setApellidp(String apellidp) {
        this.apellidp = apellidp;
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

    public UsuarioCliente getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioCliente usuario) {
        this.usuario = usuario;
    }

    public ImagenCliente getImagenCliente() {
        return imagenCliente;
    }

    public void setImagenCliente(ImagenCliente imagenCliente) {
        this.imagenCliente = imagenCliente;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }
}
