package Ejercicio_Herencia_Abstract_04;

public class Circulo extends Figura_Geometrica {

    private float radio;

    public Circulo() {
        System.out.println("Figura Circulo");
    }

    public Circulo(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
    @Override
    public void calcularArea() {
        System.out.println("Area Circulo: " + 
                (Math.PI * Math.pow(getRadio(), 2)));
    }
    @Override
    public void calcularPerimetro() {
        System.out.println("Perimetro Circulo: "+
                (2 * Math.PI * getRadio())+"\n");
    }}
