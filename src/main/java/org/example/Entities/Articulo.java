package org.example.Entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "articulos")
public class Articulo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
