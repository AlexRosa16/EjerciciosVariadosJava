class A extends B{
    void metodo() {
        System.out.println("Metodo de A");
    }
}

class B {
    void metodo2() {
        System.out.println("Metodo de B");
    }
}

public class Herencia1 {
    public static void main( String[] args ) {
        B obj = new A();
        B obj2 = new B();
        obj.metodo2();
        obj2.metodo2();
    }
}
