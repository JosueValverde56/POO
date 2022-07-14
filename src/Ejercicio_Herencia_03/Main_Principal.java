
package Ejercicio_Herencia_03;

public class Main_Principal {

    public static void main(String[] args) {

        Proyecto pro = new Proyecto();
        pro.toString();
        System.out.println(pro.toString());
        
         Proyecto_Secreto proS = new Proyecto_Secreto();
        proS.toString();
        System.out.println(proS.toString());
    }
}
