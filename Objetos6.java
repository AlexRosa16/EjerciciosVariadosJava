import java.util.Scanner;

class BarraDeEstado{

    private final int porcentagedescarga;

    public BarraDeEstado(int porcentagedescarga){

        this.porcentagedescarga = porcentagedescarga;
    }


    public void mostrardescarga(){
        if (porcentagedescarga < 0 || porcentagedescarga > 100){
            System.out.println("Ese porcentaje no es valido");
        }
        else {
            System.out.println("||||||||||||||||||| % " + porcentagedescarga +" completado....");

        }

    }
}



public class Objetos6 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime el porcentaje de descarga");
        int pordescarga = scanner.nextInt();
        BarraDeEstado descarga = new BarraDeEstado(pordescarga);
        descarga.mostrardescarga();




    }


}

