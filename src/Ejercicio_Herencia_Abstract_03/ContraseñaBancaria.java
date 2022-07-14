package Ejercicio_Herencia_Abstract_03;

public class ContraseñaBancaria extends Contraseña {

    private int añoNacimiento;

    public ContraseñaBancaria() {
        System.out.println("SEGURIDAD BANCARIA ");
    }

    public ContraseñaBancaria(int añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }

    public int getAñoNacimiento() {
        return añoNacimiento;
    }

    public void setAñoNacimiento(int añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }

    @Override
    public void generarContraseña() {

        System.out.println("Contraseña Bancaria: ");
        
        if (getAñoNacimiento() % 2 == 0) {
            setLongitud(10);
        } else {
            setLongitud(9);
        }
        for (int i = 0; i < getLongitud(); i++) {
            char caracter = (char) (Math.random() * 15 + '1');

            System.out.print(caracter);
        }
    }
}
