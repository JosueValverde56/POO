package Ejercicio_Herencia_01;

import Lectura_Datos.Consola;
import java.util.Scanner;

public class Fibonacci {
    
    public int fibonacci(int n) {
        if (n > 1 && n < tamaño) {
            return fibonacci(n - 1) + fibonacci(n - 2);
        } else if (n == 1) {
            return 1;
        } else if (n == 0) {
            return 0;
        } else {
            Consola.notificarError("Debes ingresar un tamaño mayor o igual a 1");
            return -1;
        }
    }

    Scanner teclado = new Scanner(System.in);

    protected int tamaño;

    public Fibonacci() {
        System.out.println("\n*****************");
        Consola.notificarÉxito(" SERIE FIBONACCI");
        System.out.println("*****************\n");
    }
    public Fibonacci(int tamaño) {
        this.tamaño = tamaño;
    }
    

    public void mostrarSerie() {

        System.out.print("Ingrese cantidad de elmentos para la serie: ");

        tamaño = teclado.nextInt();
        
            for (int i = 0; i < tamaño; i++) {
                Consola.notificarÉxito02(fibonacci(i) + "-");
        }
        System.out.println();
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
}
