import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un numero: ");
        int numero = scanner.nextInt();
        System.out.println("Dime otro numero: ");
        int numero2 = scanner.nextInt();

        if (numero > numero2)
            for (int i = numero2 + 1; i < numero; i++)
                System.out.println(i);
        else
            for (int i = numero + 1; i < numero2; i++)
                System.out.println(i);


    }
}
