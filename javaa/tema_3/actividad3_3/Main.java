package javaa.tema_3.actividad3_3;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/acceso_a_datos";
        try {
            Connection c = DriverManager.getConnection(url, "root", "");
            CallableStatement s = c.prepareCall("{call buscar_por_dni(?)}");
            s.setString(1, "56789012B");
            s.execute();
            ResultSet rs = s.getResultSet();
            while (rs.next()) {
                System.out.println(rs.getString("apellidos"));
            }

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
