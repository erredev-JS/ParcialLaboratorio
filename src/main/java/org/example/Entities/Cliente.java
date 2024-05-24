package org.example.Entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Clientes")
public class Cliente {
    //Atributos
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



}
