package Ejercicio_Herencia_Abstract_04;

public abstract class Figura_Geometrica {
    
    protected String nombre;

    public Figura_Geometrica() {
        System.out.println("---------------------");
        System.out.println("FIGURAS GEOMETRICAS");
        System.out.println("---------------------\n");
    }
    public Figura_Geometrica(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public final void imprimirNombre() {
        Consola.notificarÉxito("Figura Geometrica: " 
                + this.getClass().getSimpleName());
    }
    public abstract void calcularArea();

    public abstract void calcularPerimetro();
}
