package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.security.auth.login.Configuration;


public class App {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        // Crear Sede
        Sede sede = new Sede("sede1");
        session.save(sede);
        //tx.commit();

        Departamento departamento1 = new Departamento("departamento1", sede);
        session.save(departamento1);
        Departamento departamento2 = new Departamento("departamento2", sede);
        session.save(departamento2);

        tx.commit();

        session.close();

        System.out.println("✅ Sede guardada con éxito");
    }
}
