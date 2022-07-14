package Ejercicio_Herencia_Abstract_04;

public class Triangulo extends Figura_Geometrica {

    private float base, altura, lado2, lado3;

    public Triangulo() {
        System.out.println("Figura Triangulo");
    }

    public Triangulo(float base, float altura, float lado2, float lado3) {
        this.base = base;
        this.altura = altura;

        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getLado2() {
        return lado2;
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }

    public float getLado3() {
        return lado3;
    }

    public void setLado3(float lado3) {
        this.lado3 = lado3;
    }
    
    @Override
    public void calcularArea() {

        System.out.println("Area Triangulo: " + (getBase() * getAltura()) / 2);
    }
    @Override
    public void calcularPerimetro() {
        System.out.println("Perimetro Triangulo: " + 
                (getBase() + getLado2() + getLado3())+"\n");
    }
}
