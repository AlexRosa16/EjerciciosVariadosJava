public class Ejercicio3 {

    public static void main(String[] args) {

        int a = 3;
        int b = 4;
        int c = 5;
        int minimo = 0;

        if (a < b && a < c)
            minimo = a;
        else if (b < a && b < c)
            minimo = b;
        else if (c < a && c < b)
            minimo = b;

        System.out.println("El minimo de los numeros es " + minimo);

    }
}