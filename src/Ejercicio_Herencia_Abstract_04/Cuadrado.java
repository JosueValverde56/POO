package Ejercicio_Herencia_Abstract_04;

public class Cuadrado extends Figura_Geometrica {

    private float lado;

    public Cuadrado() {
        System.out.println("Figura Cuadrado");
    }
    public Cuadrado(float lado) {
        this.lado = lado;
    }
    
    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        System.out.println("Area Cuadrado: " + (getLado() * getLado()));
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("Perimetro Cuadrado: " + (getLado() * 4)+"\n");
    }
}
