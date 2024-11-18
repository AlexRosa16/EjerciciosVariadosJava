// Clase Empleado
class Empleado {
    private String nombre;
    private String apellido;
    private int salario;
    boolean sabeingles;
    private boolean activo;

    public Empleado(String nombre, String apellido, int salario, boolean sabeingles, boolean activo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.sabeingles = sabeingles;
        this.activo = activo;
    }

    public boolean getSabeingles() {
        return sabeingles;
    }

    public void setSabeingles(boolean sabeingles) {
        this.sabeingles = sabeingles;
    }

    public void subesueldo(int cantidad) {
        this.salario += cantidad;
    }

    public void despedir() {
        this.activo = false;
    }
}

// Clase Administrativo
class Administrativo extends Empleado {
    private int numfacturas;
    private boolean titulado;

    public Administrativo(String nombre, String apellido, int salario, boolean sabeingles, boolean activo, int numfacturas, boolean titulado) {
        super(nombre, apellido, salario, sabeingles, activo);
        this.numfacturas = numfacturas;
        this.titulado = titulado;
    }

    public boolean getSabeingles() {
        return sabeingles;
    }

    public void setSabeingles(boolean sabeingles) {
        this.sabeingles = sabeingles;
    }
    public int getNumfacturas() {
        return numfacturas;
    }

    public void setNumfacturas(int numfacturas) {
        this.numfacturas = numfacturas;
    }

    public boolean getTitulado() {
        return titulado;
    }

    public void setTitulado(boolean titulado) {
        this.titulado = titulado;
    }


    public void conseguirtitulo() {
        this.titulado = true;
    }
}

// Clase Técnico
 class Tecnico extends Empleado {
    private int numreparaciones;
    private boolean sabejava;

    public Tecnico(String nombre, String apellido, int salario, boolean sabeingles, boolean activo, int numreparaciones, boolean sabejava) {
        super(nombre, apellido, salario, sabeingles, activo);
        this.numreparaciones = numreparaciones;
        this.sabejava = sabejava;
    }

    public void aprendejava() {
        this.sabejava = true;
    }
}
public class Examen3
{
    public static void main(String[] args) {
    // Creamos los objetos
    Administrativo admin1 = new Administrativo("Juan", "García", 1500, true, true, 300, false);
    Administrativo admin2 = new Administrativo("María", "González", 1200, false, true, 150, true);
    Tecnico tecnico1 = new Tecnico("Carlos", "Pérez", 2000, true, true, 50, true);
    Tecnico tecnico2 = new Tecnico("Laura", "Martínez", 1800, false, true, 80, false);

    Empleado[] empleados = {admin1, admin2, tecnico1, tecnico2};

        for (Empleado empleado : empleados) {
            if (empleado instanceof Administrativo) {
                Administrativo admin = (Administrativo) empleado;
                if (admin.getTitulado() && admin.getSabeingles()) {
                    empleado.subesueldo(100);
                }
                if (!admin.getTitulado() || admin.getNumfacturas() < 200) {
                    empleado.despedir();
                }
            } else if (empleado.getSabeingles()) {
                empleado.subesueldo(100);
            }
        }



    }

}