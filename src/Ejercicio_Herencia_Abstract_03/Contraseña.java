package Ejercicio_Herencia_Abstract_03;

public abstract class Contraseña {

    protected int longitud;

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public final void imprimirNombre() {
        Consola.notificarÉxito("GENERAR CONTRASEÑAS: "
                + this.getClass().getSimpleName());
        System.out.println("Todo usuario y contraseña debe ser Integra, "
                + "Funcional y Disponible");
    }

    public abstract void generarContraseña();
}
