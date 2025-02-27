package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.security.auth.login.Configuration;


public class App {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        try {
            // Crear Sede
            Sede sede = new Sede("sede1");
//            session.persist(sede);
//            tx.commit();

            Departamento departamento1 = new Departamento("departamento1", sede);
//            session.persist(departamento1);
//            tx.commit();

            Departamento departamento2 = new Departamento("departamento2", sede);
//            session.persist(departamento2);
//            tx.commit();


            Empleado empleado1 = new Empleado("12345678A", "Pedro", departamento1);
//            session.persist(empleado1);
//            tx.commit();

            Empleado empleado2 = new Empleado("12345678B", "Juan", departamento2);
//            session.persist(empleado2);
//            tx.commit();

            session.close();
            System.out.println("✅ Sede guardada con éxito");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
