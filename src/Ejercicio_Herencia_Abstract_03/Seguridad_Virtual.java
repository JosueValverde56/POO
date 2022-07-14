package Ejercicio_Herencia_Abstract_03;

public abstract class Seguridad_Virtual {

    protected String confidencialidad;
    protected String integridad;
    protected String disponibilidad;

    public Seguridad_Virtual() {
        System.out.println("---------------------");
        System.out.println("  SEGURIDAD VIRTUAL");
        System.out.println("---------------------");
    }
    public Seguridad_Virtual(String confidencialidad, String integridad,
            String disponibilidad) {
        this.confidencialidad = confidencialidad;
        this.integridad = integridad;
        this.disponibilidad = disponibilidad;
    }

    public final void imprimirNombre() {
        Consola.notificarÉxito("Figura Geometrica: "
                + this.getClass().getSimpleName());
        System.out.println("Todo usuario y contraseña debe ser Integra, "
                + "Funcional y Disponible");
    }

    public abstract void generarUsuario();

    public abstract void generarContraseña();
}
