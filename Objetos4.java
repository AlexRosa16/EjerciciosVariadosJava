import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Objetos4 {

    private final int[] listaprimitiva;
    private final int nnacional;


    public Objetos4() {

        nnacional = 5421242;
        listaprimitiva = new int[6];

        listaprimitiva[0] = 4547823;
        listaprimitiva[1] = 4547824;
        listaprimitiva[2] = 4547825;
        listaprimitiva[3] = 4547826;
        listaprimitiva[4] = 4547827;
        listaprimitiva[5] = 4547828;


    }

    public double comprobarnumeronacional(int boleto) {
        if (boleto == nnacional) {
            return 1;
        } else {
            return 0;
        }

    }

    public double comprobarnumerosprimitiva(int i, double valor) {
        if (listaprimitiva[i] == valor) {
            return 1;
        } else {
            return 0;
        }
    }

    public int generadornacional() {
        Random boletog = new Random();
        return boletog.nextInt(999999) ;

    }

    public int[] generadorprimitiva() {
        Random primitivas = new Random();
        int[] numerospri = new int[6];
        for (int i = 0; i < 6; i++) {
            int primitivaaletorio = primitivas.nextInt(999999);
            numerospri[i] = primitivaaletorio;
        }
        return numerospri;

    }

    public void premiados(){

        System.out.println("El numero nacional afortunado es : " + nnacional + "\nLos numeros de primitivas afortunados son: " +  Arrays.toString(listaprimitiva));

    }


    public static void main(String[] args) {
        Objetos4 loteria = new Objetos4();
        Scanner scanner = new Scanner(System.in);


        while (true) {

            System.out.println("Elige el numnero de la opcion");
            System.out.println("1.Comprobar boleto nacional");
            System.out.println("2.Comprobar numeros primitiva");
            System.out.println("3.Cambiar boleto nacional");
            System.out.println("4.Cambiar boletos primitivas");
            System.out.println("5.Ver numero nacional afortunado y numeros de la primitiva afortonados");
            System.out.println("6.Salir");

            int opcion = scanner.nextInt();


            if (opcion == 1) {
                System.out.println("Introduce tu numero de la loteria nacional");
                int boleto = scanner.nextInt();
                if (loteria.comprobarnumeronacional(boleto) == 1) {
                    System.out.println("ENHORABUENA TU BOLETO ES EL AFORTUNADO");
                } else {
                    System.out.println("OHH TU BOLETO NO ES EL AFORTUNADO");
                }
            }
            else if (opcion == 2) {
                for (int i = 0; i < 6; i++) {
                    System.out.println("Dime un numero de primitiva");
                    int valor = scanner.nextInt();
                    if (loteria.comprobarnumerosprimitiva(i, valor) == 1) {
                        System.out.print("ENHORABUENA EL NUMERO " + valor + " HA SIDO PREMIADO \n");

                    } else {
                        System.out.print("EL NUMERO " + valor + " NO HA SIDO PREMIADO \n");
                    }

                }
                break;
            } else if (opcion == 3) {

                System.out.println("Desea cambiar su numero nacional (si o no)");
                String decision = scanner.next();
                if (decision.equals("si")) {
                    int generado = loteria.generadornacional();
                    System.out.print("Su numero nacional ha sido cambiado por el numero : " + generado +  "\n");
                }
                if (decision.equals("no")) {
                    break;
                }
            } else if (opcion == 4) {
                System.out.println("Desea cambiar sus numeros de la primitiva(si o no)");
                String decisionp = scanner.next();
                if (decisionp.equals("si")) {
                    int[] numerosprimitiva;
                    numerosprimitiva = loteria.generadorprimitiva();
                    System.out.print("Sus numeros de primitiva han sido cambiados por estos : " );
                    for (int i = 0; i < numerosprimitiva.length; i++) {
                        System.out.print(numerosprimitiva[i]);
                        if (i < numerosprimitiva.length - 1) {
                            System.out.print(", ");
                        }
                    }
                    System.out.println();
                }
                if (decisionp.equals("no")) {
                    break;
                }

            }
            else if (opcion == 5) {
                loteria.premiados();

            }
            else if(opcion == 6){
                break;
            }
        }

    }

}






