package javaa.tema_3.actividad3_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/acceso_a_datos";
        try {
            Connection con = DriverManager.getConnection(url, "root", "");
            Statement s = con.createStatement();
            s.execute("CREATE TABLE clientes(dni VARCHAR(9) NOT NULL PRIMARY KEY,apellidos VARCHAR(32) NOT NULL,cp VARCHAR(5))");
            int nFil = s.executeUpdate("INSERT INTO clientes(dni, apellidos, cp) \r\n" + //
                                "VALUES\r\n" + //
                                "('78901234X', 'NADALES', '44126'),\r\n" + //
                                "('89012345E', 'HOJAS', null),\r\n" + //
                                "('56789012B', 'SAMPER', '29730'),\r\n" + //
                                "('09876543K', 'LAMIQUIE', null)\r\n" + //
                                "");


            System.out.println(nFil + " Filas insertadas");
            s.executeUpdate("DELETE FROM clientes WHERE dni='09876543K'");
            s.close();
            con.close();
        } catch (SQLException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }
}
