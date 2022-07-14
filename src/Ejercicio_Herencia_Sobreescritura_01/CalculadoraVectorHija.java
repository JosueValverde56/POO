package Ejercicio_Herencia_Sobreescritura_01;

import java.util.Random;


public class CalculadoraVectorHija extends Calcular_Vector {

    public CalculadoraVectorHija() {
        System.out.println("Ejecucion desde Calcular Vector Hija");
    }
     public final int[] sumaVectores1(int[] vector1, int[] vector2) {
          int[] vectorSumaResultante = new int[4];
        Random rnd = new Random();
        for (int i = 0; i < vectorSumaResultante.length; i++) {
            vectorSumaResultante[i] += vector1[i] + vector2[i];
        }
        return vectorSumaResultante;
    }

    @Override
    public float productoPunto(int[] vector1, int[] vector2) {
        int[] productoPunto = new int[4];
        for (int i = 0; i < productoPunto.length; i++) {
            productoPunto[0] = (vector1[i] * vector2[i]) + (vector1[i] * vector2[i]);
        }
        return n;
    }

    @Override
    public int[] productoPuntoEscalar(int[] vector1, int[] vector2) {
        int[] productoPunto = new int[4];
        for (int i = 0; i < productoPunto.length; i++) {
            productoPunto[0] = ((vector1[i] * vector2[i]) + (vector1[i] * vector2[i]) * escalar);
        }
        return productoPunto;
    }
}
