import java.util.Scanner;

public class Metodos4 {

        public static void main(String[] args){

            Scanner scanner = new Scanner(System.in);

            System.out.println("Dime un numero si es divisible por ciertos numeros");
            int num = scanner.nextInt();

            boolean divisible2 = divisible_dos(num);
            boolean divisible3= divisible_tres(num);
            boolean divisible5= divisible_cinco(num);
            boolean divisibletodos= divisible_todos(num);

            System.out.println("El numero que has introducido es : " + num);
            System.out.println("El numero " + num + "es divisible entre 2 ? " + divisible2);
            System.out.println("El numero " + num + "es divisible entre 3 ? " + divisible3);
            System.out.println("El numero " + num + "es divisible entre 5 ? " + divisible5);
            System.out.println("El numero " + num + "es divisible entre 2,3 y 5 a la vez ? " + divisibletodos);
        }
        public static boolean divisible_dos(int num){

            return num % 2 == 0;

        }

        public static boolean divisible_tres(int num){

            return num % 3 == 0;

        }

        public static boolean divisible_cinco(int num){

            return num % 5 == 0;

        }

        public static boolean divisible_todos(int num){

            return num % 2 == 0 && num % 3 == 0 && num % 5 == 0;

        }



    }

