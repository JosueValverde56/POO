package Ejercicio_Herencia_01;

import Lectura_Datos.Consola;

public class Fibinacci_Hija extends Fibonacci {

    public Fibinacci_Hija() {

        System.out.println("Ejecucion desde Fibonacci Hija");
    }
    @Override
    public void mostrarSerie() {
        System.out.print("Ingrese cantidad de elmentos para la serie: ");
        tamaño = teclado.nextInt();

        int num1 = 0, num2 = 1, i = 1;
        while (i <= tamaño) {
            Consola.notificarÉxito02( num1 + "|");
            int suma = num1 + num2;
            num1 = num2;
            num2 = suma;
            i++;
        }
        System.out.println();
    }
}
