package org.example.Entities;

import org.example.Entities.enums.Rol;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.time.LocalDate;


@Entity
@Table(name = "Empleados")
public class Empleado {
    private String nombre;
    private String apellidp;
    private String telefono;
    private String email;
    private LocalDate fechaNacimiento;

    @Enumerated
    private Rol rol;
    @OneToOne
    private UsuarioEmpleado usuarioEmpleado;
    @OneToOne
    private ImagenEmpleado imagenEmpleado;
}
