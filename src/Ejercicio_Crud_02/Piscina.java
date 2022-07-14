
package Ejercicio_Crud_02;

public class Piscina {
    private double volumen;
    private boolean cubierta;

    public double getVolumen() {
        return volumen;
    }
    public void setVolumen(double valor) {
        volumen = valor;
    }
    public boolean tieneCubierta() {
        return cubierta;
    }
    public void setCubierta(boolean valor) {
        cubierta = valor;
    }
    @Override
    public String toString() {
        String cubiertaTexto = cubierta ? "Está cubierta" : "No está cubierta";
        return "{volumen: " + volumen + ",  " + cubiertaTexto + "}";
    }
}
