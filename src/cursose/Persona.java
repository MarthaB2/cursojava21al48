package cursose;

public class Persona {
    private String nombre;
    private int edad;
    ///35: ejemplo aplicativo
    private int cuenta;
    private double monto;

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    ///////////////////////////

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void mostrarDeInstancia() {
        System.out.println(this.nombre + ", " +this.edad);
    }

    public static void mostrarDeClase() {
        System.out.println("Metodo static");
    }
}
