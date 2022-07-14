
package Ejercicio_Crud_02;

public class Inmueble {
    
    private double superficie;
    private double precio;
    private int numeroHabitaciones;
    private Fecha fechaConstruccion;
    private Garage garage;
    private Piscina piscina;
    private Propietario propietario;

    public static int numeroMinimoHabitaciones;
    public static int numeroMaximoHabitaciones;

    public double getSuperficie() {
        return superficie;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double valor) {
        precio = valor;
    }

    public void setSuperficie(double valor) {
        superficie = valor;
    }

    public int getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public void setNumeroHabitaciones(int valor) {
        numeroHabitaciones = valor;
    }

    public Fecha getFechaConstruccion() {
        return fechaConstruccion;
    }

    public void setFechaConstruccion(Fecha valor) {
        fechaConstruccion = valor;
    }

    public Garage getGarage() {
        return garage;
    }

    public void setGarage(Garage valor) {
        garage = valor;
    }

    public Piscina getPiscina() {
        return piscina;
    }

    public void setPiscina(Piscina valor) {
        piscina = valor;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario valor) {
        propietario = valor;
    }

    @Override
    public String toString() {
        String garageTexto = garage == null ? "no tiene" : garage.toString();
        String piscinaTexto = piscina == null ? "no tiene" : piscina.toString();
        return "Inmueble: \n" + "  superficie: " + superficie + "\n" + "  habitaciones: "
                + numeroHabitaciones + "\n" + "  contruido el: " + fechaConstruccion.toString()
                + "\n" + "  propietario: " + propietario + "\n" + "  garage: " + garageTexto + "\n"
                + "  piscina:" + piscinaTexto + "\n  precio: " + precio
                + "\n-----------------------------------------------------------------------------\n";
    }
}
