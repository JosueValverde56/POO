
package Ejercicio_Herencia_Abstract_04;

public class Rectangulo extends Cuadrado {
    
    private int base;
    private int altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public Rectangulo() {
        System.out.println("Figura Rectangulo");
    }
    @Override
    public void calcularArea() {
        System.out.println("Area Rectangulo: "+(base*altura));
    }
    @Override
    public void calcularPerimetro() {
        System.out.println("Perimetro Rectangulo: "+(2*(base+altura))+"\n");
    }
}
