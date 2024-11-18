import java.util.Scanner;

public class UD6ej8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un numero");
        int numero1 = scanner.nextInt();
        int contenedor = 0;
        for (int i=1;i<numero1; i++) {
            if (numero1 % i == 0) contenedor += i;

        }

        if (contenedor == numero1) System.out.println("Es un numero perfecto");
        else System.out.println("No es numero perfecto");

    }

}


