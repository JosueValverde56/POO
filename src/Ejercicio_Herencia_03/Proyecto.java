package Ejercicio_Herencia_03;

import Lectura_Datos.Consola;

public class Proyecto {

    protected String codigo;
    protected String nombre;
    protected String descripcion;

    public Proyecto() {
        System.out.println("****************");
        Consola.notificarÉxito("    PROYECTO");
        System.out.println("****************");
    }

    public Proyecto(String codigo, String nombre, String descripcion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Codigo: " + this.codigo
                + "; Nombre: " + this.nombre
                + "; Descripción: " + this.descripcion;
    }
}
