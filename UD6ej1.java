import java.util.Scanner;

public class UD6ej1 {

    static final int meses = 12;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime el numero de tu  mes: ");
        int mes = scanner.nextInt();

        System.out.println("Hay " + meses  + " meses en el año");

        int procentage = (mes * 100 / meses);
        System.out.println("Ha pasado " + procentage + " % del año");

    }
}