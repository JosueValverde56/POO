package Ejercicio_Herencia_Abstract_03;

public class ContraseñaCorreos extends Contraseña {

    public ContraseñaCorreos() {
        System.out.println("SEGURIDAD CORREOS ");
    }

    @Override
    public void generarContraseña() {

        System.out.println("Contraseña Correos: ");
        longitud = 10;
        for (int i = 0; i <= getLongitud(); i++) {
            char caracter = (char) (Math.random() * 26 + '1');

            System.out.print(caracter);
        }
    }
}
