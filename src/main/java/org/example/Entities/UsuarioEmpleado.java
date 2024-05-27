package org.example.Entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "usuario_empleados")
public class UsuarioEmpleado implements Serializable {
    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String authoId;
    private String username;

    //Constructor
    public UsuarioEmpleado(String authoId, String username) {
        this.authoId = authoId;
        this.username = username;
    }

    //Getter and setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthoId() {
        return authoId;
    }

    public void setAuthoId(String authoId) {
        this.authoId = authoId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
