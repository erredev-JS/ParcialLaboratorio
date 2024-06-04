package org.example;

import org.example.Entities.*;
import org.example.Entities.enums.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("example-unit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {

            // Iniciar la transacción
            entityManager.getTransaction().begin();

            // Crear las entidades
            LocalTime lts1 = LocalTime.of(9,0,0);
            LocalTime lts12 = LocalTime.of(13,0,0);
            LocalDate ldempleado1 =LocalDate.of(1997,5,25);
            LocalDate ldempleado2 =LocalDate.of(1995,6,27);
            LocalDate ldempleado3 =LocalDate.of(1990, 1,25);
            LocalDate ldcliente1 = LocalDate.of(1999,12,25);
            LocalDate ldPromos1= LocalDate.of(2024,6,1);
            LocalDate ldPromos2= LocalDate.of(2024,7,1);

            Pais p1 = new Pais("Argentina");
            Provincia prov1 = new Provincia("Mendoza",p1);
            Localidad loc1 = new Localidad("Guaymallen", prov1);
            Localidad loc2 = new Localidad("Godoy Cruz",prov1);
            Domicilio domi1 = new Domicilio("callexxxx",1234 , 5510,loc1);
            Domicilio domi2 = new Domicilio("callezzzz",1472, 5511,loc1);
            Domicilio domi3 = new Domicilio("calleyyyy",1475, 5513,loc2);
            List<Domicilio> domcliente1 = new ArrayList<>();
            domcliente1.add(domi3);

            ImagenPromocion iPromocion1 = new ImagenPromocion("xxxpromocion");
            ImagenPromocion iPromocion2 = new ImagenPromocion("zzzpromocion");
            List<ImagenPromocion> imagesPromos = new ArrayList<>();
            imagesPromos.add(iPromocion1);
            imagesPromos.add(iPromocion2);
            Promocion promocion = new Promocion("xxxzzzyyy",ldPromos1,ldPromos2,lts1,lts12,"10%",12345.5, TipoPromocion.PROMOCION,imagesPromos);
            List<Promocion> promociones = new ArrayList<>();
            promociones.add(promocion);

            ImagenArticulo iarticulo = new ImagenArticulo("xxxxximagenarticulo1");
            List<ImagenArticulo> imagenesArt = new ArrayList<>();
            imagenesArt.add(iarticulo);
            UnidadMedida uM1= new UnidadMedida("metro");
            Articulo art1 = new ArticuloInsumo(123.2,"art1111",imagenesArt,uM1,1235.25,25,50,false);
            List<Articulo> kitart = new ArrayList<>();
            kitart.add(art1);

            Categoria cat1 = new Categoria();
            Categoria cat2 = new Categoria();
            List<Categoria> categorias =new ArrayList<>();
            categorias.add(cat1);
            categorias.add(cat2);
            Categoria categoria= new Categoria("xxxxcategoria",categorias,kitart);

            Empresa empresa = new Empresa("Utn","Universidad Tecnologica Nacional",12345666);
            Sucursal sucursal1 = new Sucursal("utnMdz", lts1, lts12, true, domi1, empresa,promociones,null);

            ImagenEmpleado iEmpleado1 = new ImagenEmpleado("iiiempleado1");
            UsuarioEmpleado uEmpleado1 = new UsuarioEmpleado("123","uuuempleado1");
            ImagenEmpleado iEmpleado2 = new ImagenEmpleado("iiiempleado2");
            UsuarioEmpleado uEmpleado2 = new UsuarioEmpleado("124","uuuempleado2");
            ImagenEmpleado iEmpleado3 = new ImagenEmpleado("iiiempleado3");
            UsuarioEmpleado uEmpleado3 = new UsuarioEmpleado("125","uuuempleado3");

            ImagenCliente iCliente1 = new ImagenCliente("iiicliente1");
            UsuarioCliente uCliente1 = new UsuarioCliente("111","uuucliente1");
            ImagenCliente iCliente2 = new ImagenCliente("iiicliente2");
            UsuarioCliente uCliente2 = new UsuarioCliente("112","uuucliente2");


            Empleado empleado1 = new Empleado("Uriel","Castelino","2222012225","uriel@gmail.com",ldempleado1,Rol.COCINERO,uEmpleado1,iEmpleado1,sucursal1);
            Empleado empleado2 = new Empleado("Paula","Geier","1234567896","paula@gmail.com",ldempleado2,Rol.CAJERO,uEmpleado2,iEmpleado2,sucursal1);
            Empleado empleado3 = new Empleado("Naza","Fiofio","1236548985","naza@gmail.com",ldempleado3,Rol.DELIVERY,uEmpleado3,iEmpleado3,sucursal1);

            Cliente cliente1 = new Cliente("Thomas","Munos","1234567888","thomas@gmail.com",ldcliente1,Rol.CLIENTE,uCliente1,domcliente1,iCliente1);

            // Persistir las entidades
            entityManager.persist(iEmpleado1);


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