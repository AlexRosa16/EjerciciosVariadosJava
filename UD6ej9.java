import java.util.Scanner;

public class UD6ej9 {

    public static void main(String[] args) {

        int random = (int)(Math.random()*100+1);
        Scanner scanner = new Scanner(System.in);


        for (int i=0;i<=5; i++) {
            System.out.println("Dime un numero");
            int numero1 = scanner.nextInt();
            if (numero1==random) {
                System.out.println("ACERTASTE"); break;
            }

            if (numero1>random) {
                System.out.println("El numero dicho es mas grande que el random");

            }
            if (numero1<random) {
                System.out.println("El numero dicho es mas pequeño que el random");

            }

        }


    }
}
