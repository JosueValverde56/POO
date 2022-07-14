package Ejercicio_Herencia_Abstract_00;

public class EmpleadoAsalariado extends Empleado {

    private float porcentajeAporte;
    private float sueldoEstablecido;
    private static EmpleadoAsalariado instancia;

    public EmpleadoAsalariado() {
    }

    public static EmpleadoAsalariado getInstancia() {
        if (instancia == null) {
            instancia = new EmpleadoAsalariado();
        }
        return instancia;
    }

    
    

    @Override
    public float calcularSueldo() {
        sueldo = getSueldoEstablecido() - getPorcentajeAporte() * sueldo / 100;
        return sueldo;
    }

    public float getPorcentajeAporte() {
        return porcentajeAporte;
    }

    public void setPorcentajeAporte(float porcentajeAporte) {
        this.porcentajeAporte = porcentajeAporte;
    }

    public float getSueldoEstablecido() {
        return sueldoEstablecido;
    }

    public void setSueldoEstablecido(float sueldoEstablecido) {
        this.sueldoEstablecido = sueldoEstablecido;
    }
}
