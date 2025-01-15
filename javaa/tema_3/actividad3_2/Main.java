package javaa.tema_3.actividad3_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/acceso_a_datos";

        try {
            Connection con = DriverManager.getConnection(url, "root", "");
            PreparedStatement select = con.prepareStatement("SELECT * FROM clientes WHERE dni=?");
            String[] ids = {"56789012B", "78901234X", "89012345E"};
            for (String id : ids) {
                select.setString(1, id);
                ResultSet setSelect = select.executeQuery();
                mostrarSelect(setSelect);
                System.out.println();
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void mostrarSelect(ResultSet select) {
        try {
            while (select.next()) {
                System.out.println("DNI: " + select.getString("dni"));
                System.out.println("Apellidos: " + select.getString("apellidos"));
                System.out.println("Codigo postal: " + select.getString("cp"));
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
