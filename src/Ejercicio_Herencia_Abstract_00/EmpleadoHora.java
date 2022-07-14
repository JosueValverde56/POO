package Ejercicio_Herencia_Abstract_00;

public final class EmpleadoHora extends Empleado {

    private float cuotaHora, horasTrabajadas;

    //llamda implicita
    public EmpleadoHora() {
        System.out.println("Ejecucion dedes el constructor"
                + " Empleado Hora");
    }
    //llamada explicita a ttraves del super
    public EmpleadoHora(String cedula) {
        super(cedula);
    }

    public float getCuotaHora() {
        return cuotaHora;
    }

    public void setCuotaHora(float cuotaHora) {
        this.cuotaHora = cuotaHora;
    }

    public float getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(float horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public String toString() {

        return "Cedula: " + this.getCedula()
                + "; Nombre: " + this.getNombre()
                + "; Apellido: " + this.getApellido()
                + "Cuota Hora: " + this.cuotaHora
                + "; Horas Trabajadas: " + this.horasTrabajadas;
    }

//    @Override
//    public void calcularSueldo() {
//        super.sueldo = cuotaHora * horasTrabajadas;
//        return sueldo;
    
 @Override
    public float calcularSueldo() {
        super.sueldo = cuotaHora * horasTrabajadas;
        return sueldo;
    }
}
