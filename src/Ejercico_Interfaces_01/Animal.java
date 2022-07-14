
package Ejercico_Interfaces_01;

public class Animal {
    private int cantidadPatas;
    private int cantidadDedos;
    public void moverse(){
        System.out.println("El animal se mueve");
    }
    public void setCantidadPatas(int cantidadPatas){
        this.cantidadPatas = cantidadPatas;
        
    }
    public int getCantidadPatas(){
        return cantidadPatas;
    }
    public void setCantidadDedos(int cantidadDedos){
        this.cantidadDedos = cantidadDedos;
    }
    public int getCantidadDedos(){
        return cantidadDedos;
    }

}
