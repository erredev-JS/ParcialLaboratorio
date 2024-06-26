package org.example.Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "clientes")
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
    @ManyToMany
    @JoinTable(name = "cliente_domicilio",joinColumns = @JoinColumn(name = "id_cliente"),inverseJoinColumns = @JoinColumn(name = "id_domicilio"))
    private List<Domicilio> domicilio;

    //Constructor
    public Cliente() {
    }

    public Cliente(String nombre, String apellidp, String telefono, String email, LocalDate fechaNacimiento, UsuarioCliente usuario, ImagenCliente imagenCliente) {
        this.nombre = nombre;
        this.apellidp = apellidp;
        this.telefono = telefono;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.usuario = usuario;
        this.imagenCliente = imagenCliente;
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

    public List<Domicilio> getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(List<Domicilio> domicilio) {
        this.domicilio = domicilio;
    }
}
