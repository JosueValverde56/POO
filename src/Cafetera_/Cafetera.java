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
public class Cafetera {
    
    private int capacidadMaxima, cantidadActual;
    
    public Cafetera(){
        capacidadMaxima=3000;
        cantidadActual=0;
    }
    
    public Cafetera(int capacidadMaxima){
        this.capacidadMaxima=capacidadMaxima;
        cantidadActual=capacidadMaxima;   
    }
    
    public Cafetera(int capacidadMaxima, int cantidadActual){
        if(cantidadActual>0){
            if(cantidadActual>capacidadMaxima ){
            this.cantidadActual=capacidadMaxima;
                
        }else{
            this.cantidadActual=cantidadActual;
            }
        }else{
            this.cantidadActual=capacidadMaxima;
        }   
    }
    
    public void llenarCafetera(){
        this.cantidadActual=capacidadMaxima;
    }
    
    public int servirTasa(int cantidadServir){
        if(cantidadServir>0){
            if(cantidadServir>cantidadActual){
            cantidadServir=cantidadActual;
            cantidadActual=0;
            return cantidadServir;
            }else{
                cantidadActual=cantidadActual-cantidadServir;
            } return cantidadServir;
        }else{
            return 0;
        }
        
    }
    
    public void vaciarCafetera(){
        this.cantidadActual=0;
    }
    
    public int agregarCafe(int cantidadCafeAg){
        this.cantidadActual=cantidadActual+cantidadCafeAg;
        return cantidadActual;
    }
}
