package org.example;

import org.example.Entities.*;
import org.example.Entities.enums.Estado;
import org.example.Entities.enums.FormaPago;
import org.example.Entities.enums.TipoEnvio;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {


        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("example-unit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();


try {

    // Ejemplo de profe


    // Persistir una nueva entidad Person
    entityManager.getTransaction().begin();

    Persona person = new Persona("Pepe", 25);


    person.setName("John Doe");
    person.setAge(30);

    entityManager.persist(person);

    // Hasta aca


    // instanciando pedido
    Pedido pedido1 = new Pedido(LocalTime.of(8,29), 5999.9, Estado.PENDIENTE, TipoEnvio.DELIVERY, FormaPago.EFECTIVO, LocalDate.of(2004,5,21));

    // instanciando detalle pedido
    DetallePedido dp1 = new DetallePedido(2, 5000.0);
    DetallePedido dp2 = new DetallePedido(1, 999.9);
    dp1.setPedido(pedido1);
    dp2.setPedido(pedido1);

    entityManager.persist(dp1);
    entityManager.persist(dp2);


    // instanciando factura
    Factura factura = new Factura(LocalDate.of(2024, 5, 20),10002350, 100000235, "No se que es este espacio", "Plata o plomo", FormaPago.EFECTIVO, 5999.9);
    entityManager.persist(factura);



    pedido1.setFactura(factura);


    entityManager.persist(pedido1);


    Pais pais1 = new Pais("Argentina");
    Provincia provincia1 = new Provincia("Mendoza", pais1);
    Localidad localidad1 = new Localidad("Godoy Cruz", provincia1);
    Domicilio domicilio1 = new Domicilio("Bernardo Ortiz", 1345, 5501, localidad1);
    Sucursal panaderia = new Sucursal("Jebbs", LocalTime.of(8,0),LocalTime.of(20,30),false, domicilio1);
    Empresa empresa1 = new Empresa("Pan","Vender Ricos Panes", 123231123);



    panaderia.setEmpresaCentral(empresa1);

    entityManager.persist(pais1);
    entityManager.persist(provincia1);
    entityManager.persist(localidad1);
    entityManager.persist(domicilio1);
    entityManager.persist(panaderia);
    entityManager.persist(empresa1);

    entityManager.getTransaction().commit();


    // Consultar y mostrar la entidad persistida
    Persona retrievedPerson = entityManager.find(Persona.class, person.getId());
    System.out.println("Retrieved Person: " + retrievedPerson.getName());

    }catch (Exception e){

    entityManager.getTransaction().rollback();
    System.out.println(e.getMessage());
    System.out.println("No se pudo grabar la clase Persona");}

        // Cerrar el EntityManager y el EntityManagerFactory
        entityManager.close();
        entityManagerFactory.close();
    }
}