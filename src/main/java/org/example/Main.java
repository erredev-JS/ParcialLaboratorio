package org.example;

import org.example.Entities.DetallePedido;
import org.example.Entities.Factura;
import org.example.Entities.Pedido;
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
    // Persistir una nueva entidad Person
    entityManager.getTransaction().begin();

    Persona person = new Persona("Pepe", 25);


    person.setName("John Doe");
    person.setAge(30);

    entityManager.persist(person);

    Pedido pedido = new Pedido(LocalTime.of(8,29), 5999.9, Estado.PENDIENTE, TipoEnvio.DELIVERY, FormaPago.EFECTIVO, LocalDate.of(2004,5,21));


    DetallePedido dp1 = new DetallePedido(2, 5000.0);
    DetallePedido dp2 = new DetallePedido(1, 999.9);
    entityManager.persist(dp1);
    entityManager.persist(dp2);



    Factura factura = new Factura(LocalDate.of(2024, 5, 20),10002350, 100000235, "No se que es este espacio", "Plata o plomo", FormaPago.EFECTIVO, 5999.9);
    entityManager.persist(factura);

    pedido.getDetallePedidos().add(dp1);
    pedido.getDetallePedidos().add(dp2);
    pedido.setFactura(factura);


    entityManager.persist(pedido);

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