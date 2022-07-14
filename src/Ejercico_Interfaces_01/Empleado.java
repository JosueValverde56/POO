package Ejercico_Interfaces_01;

public class Empleado extends Persona implements MetodosGenerales, Utilitarios {
    
    private Animal usa;
    
    public void moverse(){
        usa.moverse();     
    }
    public Empleado(){
        usa = new Animal();
    }
    public void setCantidadPatas(int cantidadPatas){
        usa.setCantidadPatas(cantidadPatas);
    }
    public int getCantidadPatas(){
        return usa.getCantidadPatas();   
    }
    
    public void setCantidadDedos(int cantidadDedos){
        usa.setCantidadDedos(cantidadDedos);
    }
    public int getCantidadDedos(){
        return usa.getCantidadDedos();   
    }
    
    
    @Override
    public void bailar() {
    }

    @Override
    public void hablar(String parametro) {
    }

    @Override
    public void hablar() {
    }

    @Override
    public int desplazarse() {
        return 0;
   }

    @Override
    public void jugar() {
    }

    @Override
    public void dormir() {
    }

    @Override
    public void alimentarse() {
    }

    @Override
    public void metodo1() {
    }
    
}

