import java.util.Random;
import java.util.Scanner;

abstract class Animal {
    int edad;
    char sexo;
    int peso;
    boolean esVegetariano = false;
    boolean esSalvaje;
    int estomago;
    int velocidad;
    boolean esvivo;

    Animal(){}

    Animal(int edad, char sexo, int peso, boolean esVegetariano, boolean esSalvaje, int estomago, int velocidad, boolean esvivo) {

        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.esVegetariano = esVegetariano;
        this.esSalvaje = esSalvaje;
        this.estomago = estomago;
        this.velocidad = velocidad;
        this.esvivo = esvivo;
    }

    static void enfrentarse(Animal animal1, Animal animal2) {

        if (animal1.esVegetariano && animal2.esVegetariano) {
            System.out.print("No hacen nada");
        }
        // dos animales vegetarianos
        else if (animal1.estomago >= 50 && !animal1.esVegetariano || animal2.estomago >= 50 && !animal2.esVegetariano) {
            System.out.print("No hacen nada");
        }
        // un animal carnivoro pero no tiene hambre
        else if (animal1.estomago <= 50 && !animal1.esVegetariano) {
            animal1.gritar();
            animal2.gritar();
            if (animal2.huir() >= 50) {
                System.out.print("El" + animal2 + "ha conseguido huir");
            } else {
                ((Leon)animal1).darzarpazo();
                System.out.print("El" + animal2 + "no ha conseguido huir");
                ((Leon)animal1).comer(animal2);
            }

            // animal1 se come al 2
        } else if (animal2.estomago <= 50 && !animal2.esVegetariano) {
            animal2.gritar();
            animal1.gritar();
            if (animal1.huir() >= 50) {
                System.out.print("El" + animal1 + "ha conseguido huir");
            } else {
                ((Leon)animal2).darzarpazo();
                System.out.print("El" + animal1 + "no ha conseguido huir");
                ((Leon)animal2).comer(animal1);
            }

            // animal1 se come al 2
        }

    }

     void comer(int hierba) {


        if (this.estomago + hierba >= 100) {
            this.estomago = 100;
            System.out.print("Ya no puedo mas!!");
        }
        else{
            this.estomago = this.estomago + hierba;
        }


    }

    Animal aparearse(Animal animal1, Animal animal2){
        Animal animalnuevo=null;
        if (animal1.getClass() == animal2.getClass() && animal1.sexo != animal2.sexo){
            if(animal1.getClass().getSimpleName() == "Pato") {
                animalnuevo = new Pato();

            }
            if(animal1.getClass().getSimpleName() == "Tortuga"){
                animalnuevo = new Tortuga();

            }
            if (animal1.getClass().getSimpleName() == "Leon"){
                animalnuevo = new Leon();
            }
        }
        else {
           System.out.print("No somos aptos para aparearnos");       }

        return animalnuevo;



    }


    abstract void gritar();


    int huir(){
        Random rd = new Random();
        return rd.nextInt(101);

    }


}

class Pato extends Animal{

    String ColorPico;

    String ColorPlumas;

    boolean esvuela;

    Pato(){}

    Pato(int edad, char sexo, int peso, boolean esVegetariano,boolean esSalvaje,int estomago,int velocidad,boolean esvivo, String ColorPico,String ColorPlumas,boolean esvuela){

      super(edad,sexo,peso,esVegetariano,esSalvaje,estomago,velocidad,esvivo);

        this.ColorPico = ColorPico;
        this.ColorPlumas = ColorPlumas;
        this.esvuela = esvuela;
        this.esVegetariano = true;
    }

    @Override
    void gritar(){
        System.out.print("QUACKK");
    }

    void volar(){
        System.out.print("El pato inicia el vuelo");
    }



}

class Tortuga extends Animal{

    String ColorCaparazon;

    boolean esescondida;

    Tortuga(){}

    Tortuga(int edad, char sexo, int peso, boolean esVegetariano, boolean esSalvaje, int estomago, int velocidad, boolean esvivo, String colorCaparazon, boolean esescondida){

        super(edad,sexo,peso,esVegetariano,esSalvaje,estomago,velocidad,esvivo);

        this.ColorCaparazon = colorCaparazon;
        this.esescondida = esescondida;
        this.esVegetariano = true;

    }

    @Override
    void gritar(){
        System.out.print("AIIII");
    }

    void esconderse(){
        System.out.print("La tortuga empieza a esconderse");
    }

}

class Leon extends Animal{
    String ColorMelena;

    boolean eshambriento;

    Leon(){}

    Leon(int edad, char sexo, int peso, boolean esVegetariano, boolean esSalvaje, int estomago, int velocidad, boolean esvivo, String ColorMelena, boolean eshambriento){
        super(edad,sexo,peso,esVegetariano,esSalvaje,estomago,velocidad,esvivo);

        this.ColorMelena = ColorMelena;
        this.eshambriento = eshambriento;
    }

    void comer(Animal animal){
        if (animal.peso <= 10) {
            this.estomago = this.estomago + 10;
        }
        if (animal.peso <= 20) {
            this.estomago = this.estomago + 20;
        }
        if (animal.peso > 20) {
            this.estomago = this.estomago + 60;
            if (this.estomago > 100) {
                System.out.print("Ya no puedo mas!!");
            }
        }
    }
    @Override
    void gritar(){
        System.out.print("GRGRGR");
    }

    void darzarpazo(){
        System.out.print("Da un zarpazo");
    }
}


public class Examen1 {

    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);


        while (true){

            System.out.print("ELIGE UNA OPCION");
            System.out.print("1.CREAR UNA TORTUGA, UN PATO Y UN LEON");
            System.out.print("2.HACER QUE LA TORTUGA COMO UN 100% DE SU ESTOMAGO");
            System.out.print("3.APAREAR UNA TORTUGA CON UN PATO");
            System.out.print("4.ENFRENTAR PATO VS PATO");
            System.out.print("5.CREAR DOS PATOS CADA UNO DE UN SEXO DISTINTO Y QUE SE APAREEN");
            System.out.print("6.ENFRENTAR LEON NO HAMBRIENTO VS TORTUGA");
            System.out.print("7.LEON VS PATO(LOGRA HUIR)");
            System.out.print("8.LEON(SE LO COME) VS PATO");

            int opcion = scanner.nextInt();

            if(opcion == 1){


            }
            if(opcion == 2){


            }
            if(opcion == 3){


            }
            if(opcion == 4){


            }
            if(opcion == 5){


            }
            if(opcion == 6){


            }
            if(opcion == 7){


            }
            if(opcion == 8){


            }






        }
    }


}
