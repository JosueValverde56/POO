package Ejercicio_Herencia_03;

import Ejercicio_Crud_03.Consola;

public class Proyecto_Secreto extends Proyecto {

    protected float presupuestoAsignado;
    protected String prioridad;
    protected int porcentajeCumplimiento;

    public Proyecto_Secreto() {
         Consola.notificarError("Ejecucion dedes Proyecto Secreto");
    }

    public Proyecto_Secreto(float presupuestoAsignado, String prioridad, int porcentajeCumplimiento) {
        this.presupuestoAsignado = presupuestoAsignado;
        this.prioridad = prioridad;
        this.porcentajeCumplimiento = porcentajeCumplimiento;
    }

    public Proyecto_Secreto(float presupuestoAsignado, String prioridad, int porcentajeCumplimiento, 
            String codigo, String nombre, String descripcion) {
        super(codigo, nombre, descripcion);
        this.presupuestoAsignado = presupuestoAsignado;
        this.prioridad = prioridad;
        this.porcentajeCumplimiento = porcentajeCumplimiento;
    }

    public float getPresupuestoAsignado() {
        return presupuestoAsignado;
    }

    public void setPresupuestoAsignado(float presupuestoAsignado) {
        this.presupuestoAsignado = presupuestoAsignado;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public int getPorcentajeCumplimiento() {
        return porcentajeCumplimiento;
    }

    public void setPorcentajeCumplimiento(int porcentajeCumplimiento) {
        this.porcentajeCumplimiento = porcentajeCumplimiento;
    }
      @Override
    public String toString() {

        return "Codigo: "+this.codigo 
            +"; Nombre: "+this.nombre
            +"; Descripción: "+this.descripcion
                + "; Presupuesto Asignado: " + this.presupuestoAsignado
                + "; Porcentaje Cumplimiento: " + this.porcentajeCumplimiento
                + "; Prioridad: " + this.prioridad+"\n";
    }
}
