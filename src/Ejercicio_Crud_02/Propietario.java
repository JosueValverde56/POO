
package Ejercicio_Crud_02;

import java.time.LocalDate;

public class Propietario {
    private String cedula;
    private String nombre;
    private String telefono;
    private Fecha fechaNacimiento;

    public String getCedula() {
        return cedula;
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Fecha valor) {
        fechaNacimiento = valor;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String valor) {
        telefono = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String valor) {
        nombre = valor;
    }

    public void setCedula(String valor) {
        cedula = valor;
    }

    @Override
    public String toString() {
        int añoActual = LocalDate.now()
                                 .getYear();
        return "{cedula: " + cedula + ", nombre" + nombre + ", telefono:" + telefono + ", edad:"
                + (añoActual - fechaNacimiento.getAño()) + "}";
    }
}
