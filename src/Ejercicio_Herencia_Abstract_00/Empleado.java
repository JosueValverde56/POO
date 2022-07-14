package Ejercicio_Herencia_Abstract_00;

public abstract class Empleado extends Persona {
    
    private String cedula;
    private String nombre;
    private String apellido;
    protected float sueldo;

    public Empleado(){
        
        System.out.println("Ejecucion dedes el constructor"
                + " Empleado");
        }
    
    public Empleado(String cedula){
        this.cedula = cedula;
            System.out.println("Ejecucion dedes el constructor"
                + " Empleado");
    
    }
    public String getCedula() {
        return cedula;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    @Override
    public String toString(){
    return "Cedula: "+this.cedula 
            +"; Nombre: "+this.nombre
            +"; Apellido: "+this.apellido;
    }
     public abstract float calcularSueldo();   
//   public abstract void calcularSueldo();
}
