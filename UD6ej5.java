import java.util.Scanner;

public class UD6ej5 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un numero");
        int numero1 = scanner.nextInt();

        if (numero1 == 4 && numero1 % 2 == 0){
            System.out.println("El numero es 4 y es par");
        }
        else{
            System.out.println("El numero no es 4 ni es par");
        }

        if (numero1 == 5|| numero1 == 10 ){
            System.out.println("El numero es 5 o 10");
        }
        else{
            System.out.println("El numero no es ni 5 ni 10");
        }
    }


}