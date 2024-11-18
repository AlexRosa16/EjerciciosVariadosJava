import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un numero: ");
        int numero = scanner.nextInt();
        if  (numero > 0) System.out.println("Es positivo ");
        else System.out.println("Es negativo ");


    }
}
