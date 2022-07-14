package Ejercicio_Herencia_Abstract_03;

public class Main_Principal {

    public static void main(String[] args) {

        ContraseñaBancaria banco = new ContraseñaBancaria();
        banco.imprimirNombre();
        banco.generarContraseña();

        System.out.println("\n");

        ContraseñaCorreos correo = new ContraseñaCorreos();
        correo.imprimirNombre();
        correo.generarContraseña();
        System.out.println("\n");
    }
}
