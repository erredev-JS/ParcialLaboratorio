package org.example;

import org.example.Entities.*;
import org.example.Entities.enums.Estado;
import org.example.Entities.enums.FormaPago;
import org.example.Entities.enums.Rol;
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

            // Iniciar la transacción
            entityManager.getTransaction().begin();

            // Crear las entidades necesarias
            LocalTime lts1 = LocalTime.of(9,0,0);
            LocalTime lts12 = LocalTime.of(13,0,0);

            Sucursal se1 =new Sucursal("sucur1",lts1,lts12,false,null,null);

            LocalDate date = LocalDate.of(2024,5,27);
            UsuarioEmpleado ue1 = new UsuarioEmpleado("1234566","Jorge123");
            ImagenEmpleado ie1 = new ImagenEmpleado("xxxxxxxximagen");

            Empleado e1 = new Empleado("Jorge","Lolo","1234567890","abcdde@gmail.com",date, Rol.COCINERO,ue1,ie1,se1);

            // Persistir primero la instancia de ImagenEmpleado
            entityManager.persist(ie1);

            // Persistir la entidad Empleado
            entityManager.persist(e1);

            entityManager.persist(se1);
            entityManager.persist(ue1);
            entityManager.persist(ie1);


            // Confirmar la transacción
            entityManager.getTransaction().commit();

        } catch (Exception e){
            // Revertir la transacción en caso de error
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {
            // Cerrar el EntityManager
            entityManager.close();
            entityManagerFactory.close();
        }


    }
}