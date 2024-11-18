import java.util.ArrayList;
import java.util.Scanner;

public class Objetos3 {

    private ArrayList<Integer> lista;


    public Objetos3(){

        lista = new ArrayList<Integer>();
    }

    public void agregar(int posicion, int valor){
        if (posicion>= 0 && posicion <=lista.size()){
            lista.add(posicion,valor);
        }

        else {
            System.out.println("La posicion " + posicion + " dicha es invalida");

        }
    }

    public int obtener(int posicion){

        if (posicion>= 0 && posicion <=lista.size()){
            return lista.get(posicion);
        }

        else {
            System.out.println("La posicion " + posicion + " dicha es invalida");
            return -1;

        }
    }


    public static void main(String[] args){
        Objetos3 pila = new Objetos3();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la longitud de la lista");
        int longitud = scanner.nextInt();

        for (int i = 0; i < longitud; i++){
            System.out.println("Dime un numero");
            int valor = scanner.nextInt();
            pila.agregar(i,valor);
        }

        while (true){

            System.out.println("Elige el numnero de la opcion");
            System.out.println("1.Agregar numero a la lista");
            System.out.println("2.Obtener nuemero de la lista mediante su posicion");

            int opcion = scanner.nextInt();

            if (opcion == 1){
                System.out.println("Dime la posicion donde agregar el numero");
                int posicion = scanner.nextInt();
                System.out.println("Dime el numero a introducir");
                int numero = scanner.nextInt();

                pila.agregar(posicion-1,numero);

            }
            else if (opcion == 2){
                System.out.println("Dime la posicion del numero a obtener");
                int posicion = scanner.nextInt();
                int valor = pila.obtener(posicion -1);

                if (valor != -1){
                    System.out.println("La posicion " + posicion + "su valor es : " + valor);
                }
            } else if (opcion == 0) {
                break;

            } else {
                System.out.println("La opcion dicha no es ni 1 ni 2");
            }








        }



    }
}
