package org.example.Entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "usuario_clientes")
public class UsuarioCliente implements Serializable {
   //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String authoId;
    private String userName;

    //Constructor
    public UsuarioCliente(String authoId, String userName) {
        this.authoId = authoId;
        this.userName = userName;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
