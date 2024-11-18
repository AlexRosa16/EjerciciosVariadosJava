import java.util.Scanner;

public class UD6ej4  {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime una letra");
        char letra1 = scanner.nextLine().charAt(0);
        System.out.println("Dime otra letra");
        char letra2 = scanner.nextLine().charAt(0);

        if (letra1<letra2){
            System.out.println(letra1 + " " + letra2);
        }
        else{
            System.out.println(letra2 + " " + letra1);

        }

    }

}
