import java.util.Scanner;

public class UD6ej7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un numero");
        Integer numero1 = scanner.nextInt();
        for (Integer i=1; i<=numero1; i++){
            for (Integer j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }


}

}
