package Ejercicio_Herencia_Abstract_04;

public class Main_Principal {

    public static void main(String[] args) {

        Circulo circulo = new Circulo(10);
        circulo.imprimirNombre();
        circulo.calcularArea();
        circulo.calcularPerimetro();

        Triangulo triangulo = new Triangulo(6, 7, 9, 9);
        triangulo.imprimirNombre();
        triangulo.calcularArea();
        triangulo.calcularPerimetro();

        Cuadrado cuadrado = new Cuadrado(5);
        cuadrado.imprimirNombre();
        cuadrado.calcularArea();
        cuadrado.calcularPerimetro();

        Rectangulo rectangulo = new Rectangulo(8, 5);
        rectangulo.imprimirNombre();
        rectangulo.calcularArea();
        rectangulo.calcularPerimetro();
    }
}
