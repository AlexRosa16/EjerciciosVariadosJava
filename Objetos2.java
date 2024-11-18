import java.util.Scanner;

public class Objetos2 {
    private double real;
    private double imaginario;


    public Objetos2(double real, double imaginario){

        this.real = real;
        this.imaginario = imaginario;

    }

  public Objetos2 suma(Objetos2 numero){

        double sumareal = this.real + numero.real;
        double sumaimaginaria = this.imaginario + numero.imaginario;

        return new Objetos2(sumareal,sumaimaginaria);

  }

  public static Objetos2 suma(Objetos2 numero1, Objetos2 numero2){

        double sumareal = numero1.real + numero2.real;
        double sumaimaginaria = numero1.imaginario + numero2.imaginario;
        return new Objetos2(sumareal,sumaimaginaria);

  }

    public String toString() {
        return real + " + " + imaginario + "i";
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dime la parte real del primer número: ");
        double real1 = scanner.nextDouble();
        System.out.print("Dime la parte imaginaria del primer número: ");
        double imaginario1 = scanner.nextDouble();
        Objetos2 numero1 = new Objetos2(real1, imaginario1);

        System.out.print("Dime la parte real del segundo número: ");
        double real2 = scanner.nextDouble();
        System.out.print("Dime la parte imaginaria del segundo número: ");
        double imaginario2 = scanner.nextDouble();
        Objetos2 numero2 = new Objetos2(real2, imaginario2);

        Objetos2 resultado1 = numero1.suma(numero2);
        Objetos2 resultado2 = Objetos2.suma(numero1, numero2);

        System.out.println("Este es el resultado con una instancia" + resultado1);
        System.out.println("Este es el resultado con una metodo estatico" + resultado2);


    }
}