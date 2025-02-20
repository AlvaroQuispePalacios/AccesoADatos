package org.example;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PruebaConexion {
    public static void main(String[] args) {
        try {
            // Cargar la configuración de Hibernate
            SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

            // Abrir una sesión para probar la conexión
            Session session = sessionFactory.openSession();
            System.out.println("✅ Conexión exitosa con la base de datos");

            // Cerrar la sesión
            session.close();
            sessionFactory.close();
        } catch (Exception e) {
            System.err.println("❌ Error en la conexión: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
