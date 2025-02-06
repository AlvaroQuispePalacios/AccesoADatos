package javaa.tema_3.actividad3_3;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/acceso_a_datos";
        try {
            Connection c = DriverManager.getConnection(url, "root", "");
            // CallableStatement s = c.prepareCall("{call buscar_por_dni(?)}");
            Statement s = c.createStatement();
            // s.setString(1, "56789012B");
            s.executeQuery("SELECT buscar_por_dni('78901234X')");
            ResultSet rs = s.getResultSet();

            while (rs.next()) {
                System.out.println(rs.getString(1));
            }

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
