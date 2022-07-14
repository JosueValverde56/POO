
package Ejercicio_Herencia_Abstract_01;

public class Generador_Cartas {
    
        public static int generaNumeroEnteroAleatorio(int minimo, int maximo) {
        int num = (int) (Math.random() * (minimo - (maximo + 1)) + (maximo + 1));
        return num;
    }
}
