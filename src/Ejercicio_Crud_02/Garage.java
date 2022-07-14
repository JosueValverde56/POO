
package Ejercicio_Crud_02;

public class Garage {
     private double superficie;
    private int numeroPlazas;

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double valor) {
        superficie = valor;
    }

    public int getNumeroPlazas() {
        return numeroPlazas;
    }

    public void setNumeroPlazas(int valor) {
        numeroPlazas = valor;
    }

    @Override
    public String toString() {
        return "{superficie: " + superficie + ",  plazas:" + numeroPlazas + "}";
    }
}
