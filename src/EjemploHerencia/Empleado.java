package EjemploHerencia;

public class Empleado extends Persona{
    private int idEmpleado;
    private double sueldo;

    private static int contadorEmpleados;

    public Empleado(String nombre, double sueldo) {
        super(nombre);// super debe ser la primera linea
        this.idEmpleado = ++contadorEmpleados;
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }
    public double getSueldo() {
        return sueldo;
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        //Primero mandamos a llamar el metodo toString de la clase Persona
        // para que podamos observar los valores de la clase padre,y
        // despues imprimimos los valores de la clase hija
        return super.toString()+"Empleado{" + "idEmpleado=" + idEmpleado +
                ", sueldo=" + sueldo + '}';
    }
}
