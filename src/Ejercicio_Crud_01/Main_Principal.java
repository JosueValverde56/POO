
package Ejercicio_Crud_01;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_Principal {
 public static void main(String[] args) {
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        gestionEmpleado(listaEmpleados);
    }

    public static void gestionEmpleado(ArrayList<Empleado> listaEmpleados) {
        //CRUD -> CREATE READ UPDATE DELETE
        int opcion;
        Scanner teclado = new Scanner(System.in);
        boolean bandera = true;
        Empleado empleado = new Empleado();
        do {
            System.out.println("***** GESTIÓN DE EMPLEADOS *****");
            System.out.println("1. Crear Empleado");
            System.out.println("2. Modificar Empleado");
            System.out.println("3. Eliminar Empleado");
            System.out.println("4. Listar Empleado");
            System.out.println("5. Listar Empleado Cedula");
            System.out.println("6. Listar Empleado Genero");
            System.out.println("7. Listar Empleado Genero y Edad");
            System.out.println("8. Salir");
            System.out.println("");
            System.out.println("Ingrese una opcion[1-5]:");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    listaEmpleados.add(empleado.crearEmpleado());
                    break;
                case 2:
                    empleado.modificarEmpleado(listaEmpleados);
                    break;
                case 3:
                    empleado.eliminarEmpleado(listaEmpleados);
                    break;
                case 4:
                    empleado.listarEmpleado(listaEmpleados);
                    break;
                case 5:
                    empleado.listarEmpleadoCedula(listaEmpleados);
                    break;
                case 6:
                    empleado.listarEmpleadoGenero(listaEmpleados);
                    break;
                case 7:
                    empleado.listarEmpleadoGeneroEdad(listaEmpleados);
                    break;
                case 8:
                    bandera = false;
                    break;
                default:
                    System.out.println("Opción incorrecta\n");
            }
        } while (bandera);

    }

    public static double imcCalculo(double peso, double estatura) {
        return peso / ((estatura / 100) * (estatura / 100));

    }
    
}
