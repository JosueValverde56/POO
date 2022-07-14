package Ejercicio_Herencia_Abstract_00;

public class Main_Principal {

    public static void main(String[] args) {

EmpleadoAsalariado singleton = EmpleadoAsalariado.getInstancia();
        EmpleadoAsalariado singleton2 = EmpleadoAsalariado.getInstancia();
        singleton.calcularSueldo();
        singleton2.calcularSueldo();
        System.out.println("");
    }
}
