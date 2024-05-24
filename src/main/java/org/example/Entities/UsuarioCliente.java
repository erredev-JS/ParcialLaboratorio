package org.example.Entities;

import javax.persistence.OneToOne;

public class UsuarioCliente {
   //Atributos
    private String authoId;
    private String userName;

    //Relacion
    private Cliente ciente;
}
