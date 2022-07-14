package Ejercicio_Herencia_Abstract_00;

public class EmpleadoComision extends Empleado {

    private float totalVentas;
    private float porcentajeComision;

     public EmpleadoComision() { 
        super();
    }

    public EmpleadoComision(float totalVentas, int porcentajeComision) {
        this.totalVentas = totalVentas;
        this.porcentajeComision = porcentajeComision;
    }

    @Override
    public float calcularSueldo() {
        System.out.println("El sueldo Total es: "+ this.totalVentas+(this.getPorcentajeComision()/this.totalVentas));
        return sueldo;
    }
    
    public float getTotalVentas() {
        return totalVentas;
    }

    public void setTotalVentas(float totalVentas) {
        this.totalVentas = totalVentas;
    }

    public float getPorcentajeComision() {
        return porcentajeComision;
    }

    public void setPorcentajeComision(float porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }
}
