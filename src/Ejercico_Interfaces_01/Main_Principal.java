
package Ejercico_Interfaces_01;

public class Main_Principal {

    public static void main(String[] args) {
        Animal perro = new Animal();
        perro.moverse();
        perro.setCantidadPatas(4);
        System.out.println("El perro tiene "+perro.getCantidadPatas()+(" patas"));
        Empleado Juan = new Empleado();
        Juan.moverse();
        Juan.setTipoSangre("A+");
        System.out.println("EL empleado tiene un tipo de Sangre: "+Juan.getTipoSangre());
        Juan.setCantidadPatas(2);
        System.out.println("La cantidad de piernas de Juan es: "+Juan.getCantidadPatas());
        Juan.setCantidadDedos(20);
        System.out.println("La cantidad de dedos de Juan es: "+Juan.getCantidadDedos());
    }
    
}
