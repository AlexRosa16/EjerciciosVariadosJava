import java.util.*;

abstract class Vehiculo{

    // ATRIBUTOS...

    String propietario;
    int deposito;
    String modelo;
    String fabricante;
    int year;
    double consumo1Km;


    //CONSTRUCTOR...

    Vehiculo(String propietario, int deposito, String modelo,String fabricante,int year, double consumo1Km){
        this.propietario=propietario;
        this.deposito=deposito;
        this.modelo=modelo;
        this.fabricante=fabricante;
        this.year=year;
        this.consumo1Km=consumo1Km;
    }


    //METODOS...

    void mostrar(){
        System.out.println("Los datos de Vehiculo son:");
        System.out.println("propietario="+propietario);
        System.out.println("deposito:"+ deposito);
        System.out.println("modelo:"+ modelo);
        System.out.println("fabricante:"+ fabricante);
        System.out.println("año:"+ year);
        System.out.println("consumo1Km:"+ consumo1Km);


    };

    abstract double consumo(); // No devuelve nada porque yo no se cual es el consumo de vehiculo
    double coste(){

        return consumo()*Gasolina.precioGasolina;

    };




}

class Gasolina{

    static double precioGasolina=1.50;
    static double precioDiesel=1.20;
}

class Coche extends Vehiculo{


    //ATRIBUTOS...

    boolean AA=false;
    boolean aparcado=false;
    int numPuertas;

    //CONSTRUCTOR...

    Coche(String propietario, int deposito, String modelo,String fabricante,int year,int numPuertas,double consumo1Km){
        super(propietario,deposito,modelo,fabricante,year,consumo1Km);//Mando los datos comunes a Vehiculo
        this.numPuertas=numPuertas;
    }

    //METODOS...

    @Override //Este es un comentario opcional pero recomendable cuando sobreescribimos un metodo
    void mostrar(){

        super.mostrar(); // Muestro los datos comunes a Vehiculo
        System.out.println("Los datos de Coche son:");
        System.out.println("numero puertas:"+numPuertas);
        System.out.println("Aire Acondicionado:"+AA);
        System.out.println("Aparcado="+aparcado);
    }

    void setAA(boolean AA){
        this.AA=AA;
    }
    @Override //Este es un comentario opcional pero recomendable cuando sobreescribimos un metodo

    double consumo(){

        if (aparcado==true) return 0;
        else if (AA==true) return consumo1Km*100*1.20;
        else return consumo1Km*100;
    }
}

class Moto extends Vehiculo{

    //ATRIBUTOS...

    int plazas;
    int ocupantes=0;
    boolean aparcado=false;

    //CONSTRUCTOR...

    Moto(String propietario, int deposito, String modelo,String fabricante,int year,int plazas, double consumo1Km){
        super(propietario,deposito,modelo,fabricante,year,consumo1Km);//Mando los datos comunes a Vehiculo
        this.plazas=plazas;
    }

    //METODOS...

    void setOcupantes(int ocupantes){
        this.ocupantes=ocupantes;
    }

    double consumo(){

        if (aparcado==true) return 0;
        else if (ocupantes==2) return consumo1Km*100*1.50;
        else if (ocupantes==1) return consumo1Km*100;
        else return 0; //La moto no tiene ocupantes
    }

    void mostrar(){

        super.mostrar(); // Muestro los datos comunes a Vehiculo
        System.out.println("Los datos de la Moto son:");
        System.out.println("numero plazas:"+plazas);
        System.out.println("numero ocupantes:"+ocupantes);
        System.out.println("aparcada:"+aparcado);
    }
}

class Barco extends Vehiculo{

    //ATRIBUTOS...
    double eslora;
    int numVelas;
    double cargapercent=0;
    boolean anclado=false;

    //CONSTRUCTOR...

    Barco(String propietario, int deposito, String modelo,String fabricante,int year,double eslora, int numVelas, double consumo1Km){
        super(propietario,deposito,modelo,fabricante,year,consumo1Km);
        this.eslora=eslora;
        this.numVelas=numVelas;
    }

    //METODOS...

    void anadircarga(double cargapercent){
        if ((this.cargapercent+cargapercent)>100) cargapercent=100;
        else this.cargapercent=this.cargapercent+cargapercent;
    }
    double consumo(){

        if (anclado==true) return 0;
        else return consumo1Km*100*(cargapercent/100+1);
    }

    void mostrar(){

        super.mostrar(); // Muestro los datos comunes a Vehiculo
        System.out.println("Los datos del barco son:");
        System.out.println("eslora"+eslora);
        System.out.println("numero de velas:"+numVelas);
        System.out.println("cargapercent:"+cargapercent);
        System.out.println("anclado:"+anclado);
    }

}

public class Main
{
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        Vehiculo [] vectVehi = new Vehiculo[3];

        for (int i=0;i<3;i++){

            System.out.println("Dime qué tipo de vehiculo quieres añadir: (1: Coche | 2: Moto | 3: Barco)");
            int respuesta=scanner.nextInt();
            scanner.nextLine();
            System.out.println("Quién es el propietario?");
            String propietario= scanner.nextLine();
            System.out.println("Quién es el fabricante?");
            String fabricante= scanner.nextLine();
            System.out.println("Cuál es el modelo?");
            String modelo= scanner.nextLine();
            System.out.println("De qué año es?");
            int year= scanner.nextInt();
            System.out.println("Cuál es la capacidad del depósito");
            int deposito= scanner.nextInt();
            System.out.println("Cuál es el consumo1Km");
            double consumo1Km= scanner.nextDouble();
            if (respuesta==1) {
                System.out.println("¿Cuantas puertas tiene el coche?");
                int puertas= scanner.nextInt();
                vectVehi[i]= new Coche(propietario,deposito,modelo,fabricante,year,puertas,consumo1Km);
            }
            if (respuesta==2){
                System.out.println("¿Cuantas plazas tiene la moto?");
                int plazas= scanner.nextInt();
                vectVehi[i]=new Moto(propietario,deposito,modelo,fabricante,year,plazas,consumo1Km);
            }

            if (respuesta==3){
                System.out.println("¿Cual es la eslora del barco?");
                double eslora= scanner.nextDouble();
                System.out.println("¿Cual es el numero de velas?");
                int numVelas= scanner.nextInt();
                vectVehi[i]=new Barco(propietario,deposito,modelo,fabricante,year,eslora,numVelas,consumo1Km);
            }




        }//Fin del for


        System.out.println("Ejercicio-------------------------------------------");
        System.out.println("a) Muestra todos y cada uno de los objetos creados, debes hacerlo con una sola llamada al método mostrar recorriendo el vector de vehiculos");

        for (int i=0;i<vectVehi.length;i++){

            System.out.println("El vehiculo "+ i +" del vector vectVehi es:");
            vectVehi[i].mostrar();

        }
        System.out.println("b) Date una vuelta con el coche y enciende el AA");

        ((Coche)vectVehi[0]).aparcado=false;
        ((Coche)vectVehi[0]).AA=true;
        System.out.println("aparcado="+((Coche)vectVehi[0]).aparcado);
        System.out.println("AA="+((Coche)vectVehi[0]).AA);


        System.out.println("c) Muestra el consumo del coche a los 100Km");


        System.out.println("El consumo del coche ahora mismo es de " + vectVehi[0].consumo() +" l/100Km");

        System.out.println("d) Muestra el coste del coche a los 100Km con la variable gasolina");

        System.out.println("El coste de recorrer 100Km del coche ahora mismo es de " + vectVehi[0].consumo()*Gasolina.precioGasolina + "€");

        System.out.println("e) Aparca el coche");
        ((Coche)vectVehi[0]).aparcado=true;
        System.out.println(((Coche)vectVehi[0]).aparcado);

        System.out.println("e) Muestra el consumo del coche");
        System.out.println("El consumo del coche ahora mismo es de " + vectVehi[0].consumo() +" l/100Km");

        System.out.println("f) Montate con tu novia/o en la moto");

        ((Moto)vectVehi[1]).setOcupantes(2);

        System.out.println( "ocupantes="+ ((Moto)vectVehi[1]).ocupantes);


        System.out.println("g) Muestra el consumo de la moto");


        System.out.println("El consumo de la moto ahora mismo es de " + vectVehi[1].consumo()+" l/100Km");


        System.out.println("h) Carga tu barco en un 50%");

        ((Barco)vectVehi[2]).anadircarga(50);

        System.out.println("cargapercent="+((Barco)vectVehi[2]).cargapercent);

        System.out.println("i) Date una vuelta con tu barco");

        ((Barco)vectVehi[2]).anclado=false;

        System.out.println("anclado="+ ((Barco)vectVehi[2]).anclado);

        System.out.println("j) Dime cual es el coste de navegar con tu barco durante 100Km");

        System.out.println("El coste de recorrer 100Km con tu barco ahora mismo es de " + vectVehi[2].consumo()*Gasolina.precioGasolina + "€");




    }//Fin del main
}//Fin de la clase