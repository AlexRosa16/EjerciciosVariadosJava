import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un numero: ");
        int numero = scanner.nextInt();

        while (numero<-1){
            System.out.println("Dime un numero: ");
            numero= scanner.nextInt();
        }
}
}