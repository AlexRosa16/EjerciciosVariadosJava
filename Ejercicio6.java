import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un numero: ");
        int numero = scanner.nextInt();
        if  (numero % 2 == 0) System.out.println("Es par ");
        else System.out.println("No es par ");


    }
}
