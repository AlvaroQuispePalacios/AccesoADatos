package javaa.listadodirectorio;

import java.io.File;
import java.util.Date;

public class ListadoDirectorio {

    public static void main(String[] args) {
        String ruta = ".";
        if (args.length >= 1)
            ruta = args[0];

        File f = new File(ruta);

        if (!f.exists()) {
            System.out.println("No existe");
        } else {
            if (f.isFile()) {
                System.out.println(ruta + "Es un fichero" + "\t" + f.length() + "bytes" + new Date(f.lastModified()));
            } else {
                System.out.println(ruta + " Es un directorio");
                File[] ficheros = f.listFiles();
                for (File fichero : ficheros) {
                    if (fichero.isFile()) {
                        // ver que permisos tiene los ficheros
                        String r = fichero.canRead() ? "r" : "-";
                        String w = fichero.canWrite() ? "w" : "-";
                        String x = fichero.canExecute() ? "x" : "-";
                        // Obtener la ultima fecha de modificacion 
                        Date ultimaFechaModificacion = new Date(fichero.lastModified());
                        System.out.println("(_)" + r + w + x + "\t" + fichero.getName() + "\t" + fichero.length()
                                + " bytes\t" + ultimaFechaModificacion);
                    } else {
                        System.out.println("(/)" + fichero.getName());
                    }
                }
            }
        }
    }

    
}