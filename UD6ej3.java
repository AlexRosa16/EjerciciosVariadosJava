import java.util.Scanner;
public class UD6ej3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime el valor de a");
        double a = scanner.nextInt();

        System.out.println("Dime el valor de b");
        double b = scanner.nextInt();

        System.out.println("Dime el valor de c");
        double c = scanner.nextInt();


        double raiz = ((b*b)-(4*a*c));
        double operacionsuma = (-b + Math.sqrt(Math.pow(b,2) - (4*a*c)))/(2*a);
        double operacionresta = (-b - Math.sqrt(raiz)) / (2*a);

        System.out.println("El resultado numero 1 es: " + operacionsuma);
        System.out.println("El resultado numero 2 es: " + operacionresta);



    }



}
