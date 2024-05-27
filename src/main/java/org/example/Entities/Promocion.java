package org.example.Entities;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "promociones")
public class Promocion implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
