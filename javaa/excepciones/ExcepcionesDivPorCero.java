package javaa.excepciones;

public class ExcepcionesDivPorCero {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        try {
            System.out.println(a + "/"+ b + "="+ a/b);
            b=0;
            System.out.println(a + "/"+ b + "="+ a/b);
            b=3;
            System.out.println(a + "/"+ b + "="+ a/b);
        } catch (Exception e) {
            System.err.println("Error en alguna division");
        }
    }

    public double divide(int a, int b) {
        return a / b;
    }
}
