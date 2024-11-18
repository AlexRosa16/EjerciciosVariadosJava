import java.util.Scanner;

public class UD6ej2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un cadena: ");
        String cadena1 = scanner.nextLine();
        System.out.println("Dime otra cadena: ");
        String cadena2 = scanner.nextLine();

        if (cadena1.equals(cadena2))System.out.println("Las dos cadenas son iguales");
        else System.out.println("Las cadenas son diferentes");


        System.out.println("La primera cadena tiene una longitud de : " + cadena1.length() + " caracteres");
        System.out.println("La segunda cadena tiene una longitud de : " + cadena2.length() + " caracteres");
        System.out.println((cadena2.charAt(1)));
        String concatenado = concatenar(cadena1,cadena2);
        System.out.println(concatenado);
        System.out.println("Dime la posicion de la primera letra escogida: ");
        int posicion1 = scanner.nextInt();
        System.out.println("Dime la posicion de la segunda letra escogida: ");
        int posicion2 = scanner.nextInt();
        System.out.println(concatenado.substring(posicion1,posicion2));



    }

    public static String concatenar(String cad1, String cad2){
        return cad1+cad2;
    }
}