import java.util.Scanner;
public class Objetos1 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Dime el ancho de la piscina");
        int ancho = scanner.nextInt();
        System.out.print("Dime el alto de la piscina");
        int alto = scanner.nextInt();
        System.out.print("Dime la altura del agua de la piscina");
        int alturaagua = scanner.nextInt();

        Piscina piscina = new Piscina(ancho,alto);
        int litros = piscina.CalcularLitrosdeAgua(alturaagua);
        System.out.println("La piscina tiene " + litros + " litros de agua");
    }

    public static class Piscina{

        private final int ancho;
        private final int alto;

        public Piscina(int ancho, int alto){

            this.ancho = ancho;
            this.alto = alto;
        }

        public int CalcularLitrosdeAgua(int alturaagua){
            int volumen = ancho * alto * alturaagua;

            return volumen * 1000;

        }

    }
}
