/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cafetera_;

/**
 *
 * @author Estudiante
 */
public class CafeteraMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cafetera cafeteraAmazon=new Cafetera(5000, 2200);
        int cantidadServir=cafeteraAmazon.servirTasa(1000);
        System.out.println("La cantidad servida es: "+cantidadServir);
        cantidadServir=cafeteraAmazon.servirTasa(1300);
        System.out.println("La cantidad servida es: "+cantidadServir);
    }
    
}
