import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un numero: ");
        int numero = scanner.nextInt();
        System.out.println("Dime otro numero: ");
        int numero2 = scanner.nextInt();

        if (numero > numero2)
            for (int i = numero2 + 1; i < numero; i++){

                if (i % 2 == 0)
                    System.out.println(i);
            }
        else{
                    for (int j = numero + 1; j < numero2; j++) {
                        if (j % 2 == 0) System.out.println(j);
            }
        }
    }
}
