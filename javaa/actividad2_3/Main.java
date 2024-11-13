package javaa.actividad2_3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dima la palabra a buscar");
        String palabraABuscar = sc.nextLine();

    }

    public void BuscarPalabra(String palabra) {
        try {
            FileReader fr = new FileReader("./fichero23.txt");
            BufferedReader br = new BufferedReader(fr);
            String linea = br.readLine();
            while (linea != null) {
                if (linea.contains(palabra)) {
                    
                }
            }
            br.close();
        } catch (Exception ex) {

        }finally{

        }
    }

    public void CrearFichero() {
        try {
            File fichero23 = new File("./fichero23.txt");
            if (!fichero23.exists()) {
                String data = "Lorem ipsum dolor, sit amet consectetur adipisicing elit. Amet mollitia fuga ea enim impedit quis nemo? Veniam amet tempore neque velit quis magnam, placeat voluptatibus porro ut, sit debitis! Cumque!\r\n"
                + //
                "    Voluptates laudantium dolores omnis numquam rerum ducimus amet! Corporis numquam, sit deleniti vitae magnam est explicabo earum excepturi molestias ipsa mollitia modi eum fugiat debitis quos, vero error iste consequuntur.\r\n"
                + //
                "    Rem esse doloremque rerum ipsam nemo debitis, excepturi aperiam, officia fuga mollitia natus possimus odio maxime at tempora ullam ut saepe magni deserunt placeat minus. Nobis, debitis. Eligendi, nihil sunt?";
                fichero23.createNewFile();
                FileWriter fw = new FileWriter(fichero23);
                fw.write(data);
                fw.close();
                System.out.println("Fichero creado");
            }
        } catch (Exception e) {

        }

    }

}