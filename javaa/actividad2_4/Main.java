package javaa.actividad2_4;

import java.io.RandomAccessFile;
import java.util.ArrayList;

public class Main {

    public static class Producto {
        private int id;
        private String nombre;
        private double precio;
        private boolean descuento;
        private char tipo;

        public Producto(int id, String nombre, double precio, boolean descuento, char tipo) {
            this.id = id;
            this.nombre = nombre;
            this.precio = precio;
            this.descuento = descuento;
            this.tipo = tipo;
        }

        public int getId() {
            return this.id;
        }

        public String getNombre() {
            return this.nombre;
        }

        public double getPrecio() {
            return this.precio;
        }

        public boolean getDescuento() {
            return this.descuento;
        }

        public char getTipo() {
            return this.tipo;
        }

    }

    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Producto(1, "Producto1", 2.5, false, 'A'));
        productos.add(new Producto(2, "Producto2", 1.3, true, 'B'));
        productos.add(new Producto(3, "Producto3", 7.1, false, 'C'));
        productos.add(new Producto(4, "Producto4", 9.2, true, 'D'));
        productos.add(new Producto(5, "Producto5", 14.4, false, 'E'));
        /* 
         *  Long: 8 bytes
         *  Integer: 4 bytes
         *  Short: 2 bytes
         *  Byte: 1 byte
         *  Double: 8 bytes
         *  Float: 4 bytes
         *  Boolean: 1 byte
         *  Char: 2 bytes
         *  String: 2 bytes por cada caracter.
        */

        try (RandomAccessFile f = new RandomAccessFile("productos.txt", "rw")){
            for(Producto producto : productos){
                f.writeInt(producto.getId()); 
                StringBuffer sb = new StringBuffer(producto.getNombre());
                sb.setLength(10);
                f.writeChars(sb.toString());  
                f.writeDouble(producto.getPrecio());
                f.writeBoolean(producto.getDescuento());
                f.writeChar(producto.getTipo());
            }
            
            f.seek(35);
            System.out.println(f.readInt());
            String nombre = "";
            for(int i = 0; i < 10; i++){
                nombre += f.readChar();
            }
            System.out.println(nombre);
            System.out.println(f.readDouble());
            System.out.println(f.readBoolean());
            System.out.println(f.readChar());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
