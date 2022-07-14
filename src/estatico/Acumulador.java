
package estatico;

import java.util.Scanner;

public class Acumulador {
    public static void main(String [] args) {
        Scanner teclado = new Scanner (System.in);
        String respuesta="";
        int acumulador=0, valor;
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese un numero");
            valor = teclado.nextInt();
            acumulador+=valor;
            System.out.println("Ingrese [siuuu] para continuar");
            respuesta = teclado.next();
            if(respuesta.equals("siuuu")){
                i--;
            }else{
                break;
            }
        }
        System.out.println("La sumatoria es: "+acumulador);
            
        }       
    }
      
    
        
    
    
