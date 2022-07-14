/*
 Se tiene una clase empleado de la cual se conoce su cedula, nombre, apellido, edad, sexo y
 teléfono;
 • En el main, genere un menú que permita gestionar la información de empleados
 (Crear, modificar, eliminar, listar).
 • Dentro del método crearEmpleado añadir la funcionalidad para que únicamente
 permita ingresar géneros con M y F
 • Generar un método para buscar aquellos empleados en donde se indique la edad
 comprendida entre 21 y 35 años (incluido los rangos) y de género masculino (M)
 • Dentro del método crearEmpleado añadir la funcionalidad para que no permita añadir
 empleados con cedulas iguales, es decir la funcionalidad adicional debe evitar cedulas
 repetidas
 • Dentro del método buscarEmpleado por género, añadir la funcionalidad para que
 muestre únicamente los dos primeros registros con el género indicado (M y F).
 A un empleado se le puede asignar o no computadores, del cual se conoce el espacio la cantidad
 de disco, de ram, velocidad de cpu, tamaño de pantalla, etc.
 • Genere los métodos necesarios para crear, modificar, eliminar y listar computadores
 • Genere un método o modifique el existente de tal modo que le permita asignar un
 computador a un empleado
 • Modificar el código de tal modo que el empleado pueda tener entre 0 o un máximo de
 3 computadores asignados
 • Añadir un método de búsqueda de empleado que permita filtrar aquellos empleados
 con más de 2 computadores
 */
package Ejercicio_Crud_00;

import Lectura_Datos.Consola;
import Ejercicio_Crud_03.Lectura_Datos;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Empleado {

    private String cedulaEmpleado;
    private String nombreEmpleado;
    private String apellidoEmpleado;
    private int edadEmpleado;
    private String telefonoEmpleado;
    private char generoEmpleado;
    private Computador tieneComputador;

    public Empleado() {
    }

    public Empleado(String cedulaEmpleado, String nombreEmpleado, String apellidoEmpleado, int edadEmpleado, String telefonoEmpleado, char generoEmpleado) {
        this.cedulaEmpleado = cedulaEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.apellidoEmpleado = apellidoEmpleado;
        this.edadEmpleado = edadEmpleado;
        this.telefonoEmpleado = telefonoEmpleado;
        this.generoEmpleado = generoEmpleado;
    }

    public Empleado crearEmpleado(Empleado e) {
        System.out.println("***** CREAR EMPLEADO *****\n");
        Empleado empleado = new Empleado();
        empleado.setCedulaEmpleado(Lectura_Datos.leerCadena("Cedula Empleado: "));
        empleado.setNombreEmpleado(Lectura_Datos.leerCadena("Nombre Empleado: "));
        empleado.setApellidoEmpleado(Lectura_Datos.leerCadena("Apellido Empleado: "));
        empleado.setEdadEmpleado(Lectura_Datos.leerInt("Edad Empleado: "));
        empleado.setGeneroEmpleado(Lectura_Datos.leerCaracter("Genero Empleado: "));
        empleado.setTelefonoEmpleado(Lectura_Datos.leerCadena("Telefono Empleado: "));
        char generoEmpleado;
         do {
            generoEmpleado = Lectura_Datos.leerCaracter("Ingrese el sexo del empleado [M/F]:");
        } while (generoEmpleado != 'M' && generoEmpleado != 'F');
        empleado.setGeneroEmpleado(generoEmpleado);
        Consola.notificarÉxito("***** EMPLEADO CREADO *****\n");
        return empleado;

        
    }

    public void listarEmpleados(ArrayList<Empleado> lista) {
        int valor = 0;

        for (Empleado empleado : lista) {
            System.out.println("***** LISTAR EMPLEADOS *****\n");
            System.out.println(valor + "Cedula: " + empleado.getCedulaEmpleado());
            System.out.println("Nombre: " + empleado.getNombreEmpleado());
            System.out.println("Apellido: " + empleado.getApellidoEmpleado());
            System.out.println("Edad: " + empleado.getEdadEmpleado());
            System.out.println("Genero: " + empleado.getGeneroEmpleado());
            System.out.println("Telefono: " + empleado.getTelefonoEmpleado());
            if (empleado.getTieneComputador() != null) {
                Computador computador = empleado.getTieneComputador();

                System.out.println("\nDisco: " + computador.getCapacidadDisco());
                System.out.println("Ram: " + computador.getMemoriaRam());
                System.out.println("Core: " + computador.getMemoriaCore());
                System.out.println("Pantalla: " + computador.getTamañoPantalla());
                System.out.println("Cpu: " + computador.getVelocidadCpu());
                System.out.println("Teclado: " + computador.isTeclado());
                System.out.println("Mouse: " + computador.isMouse());
            }
        }
        valor++;
        System.out.println("");
    }

    public void modificarEmpleados(ArrayList<Empleado> lista) {

        int valor = 0;
        do {
            int opcion = 0;
            System.out.println("***** MODIFICAR EMPLEADOS *****\n");
            System.out.println("Seleccione el Empleado a Modificar");
            for (Empleado empleado : lista) {
                System.out.println("");
                System.out.println("Opcion: " + opcion + "\nCedula: " + empleado.getCedulaEmpleado());
                System.out.println("Nombre: " + empleado.getNombreEmpleado());
                System.out.println("Apellido: " + empleado.getApellidoEmpleado());
                System.out.println("Edad: " + empleado.getEdadEmpleado());
                System.out.println("Genero: " + empleado.getGeneroEmpleado());
                System.out.println("Telefono: " + empleado.getTelefonoEmpleado());
                opcion++;
            }
            valor = Lectura_Datos.leerInt("\nSELECCIONE UNA OPCIÓN [0-" + (lista.size() - 1) + "]: ");

        } while (valor < 0 || valor > lista.size());

        Empleado e = lista.get(valor);
        crearEmpleado(e);
         Consola.notificarÉxito("***** EMPLEADO MODIFICADO *****\n");
//
//        System.out.println("***** MODIFICAR EMPLEADOS *****\n");
//
//        System.out.println("Cedula Empleado Anterio: " + lista.get(valor).getCedulaEmpleado());
//        lista.get(valor).setCedulaEmpleado(Lectura_Datos.leerCadena("Nueva Cedula Empleado: "));
//        System.out.println("");
//
//        System.out.println("Nombre Empleado Anterio: " + lista.get(valor).getNombreEmpleado());
//        lista.get(valor).setNombreEmpleado(Lectura_Datos.leerCadena("Nuevo Nombre Empleado: "));
//        System.out.println("");
//
//        System.out.println("Apellido Empleado Anterio :" + lista.get(valor).getApellidoEmpleado());
//        lista.get(valor).setApellidoEmpleado(Lectura_Datos.leerCadena("Nuevo Apellido Empleado: "));
//        System.out.println("");
//
//        System.out.println("Edad Empleado Anterio :" + lista.get(valor).getEdadEmpleado());
//        lista.get(valor).setEdadEmpleado(Lectura_Datos.leerInt("Nueva Edad Empleado: "));
//        System.out.println("");
//
//        System.out.println("Genero Empleado Anterio :" + lista.get(valor).getGeneroEmpleado());
//        lista.get(valor).setGeneroEmpleado(Lectura_Datos.leerCaracter("Nuevo Genero Empleado: "));
//        System.out.println("");
//
//        System.out.println("Telefono Empleado Anterio :" + lista.get(valor).getTelefonoEmpleado());
//        lista.get(valor).setTelefonoEmpleado(Lectura_Datos.leerCadena("Nuevo Telefono Empleado: "));
//        System.out.println("");
//
//        System.out.println("");
    }

    public void eliminarEmpleado(ArrayList<Empleado> listaEmpleado) {
        int opcion;
        System.out.println("** ELIMINAR EMPLEADO **");
        for (int i = 0; i < listaEmpleado.size(); i++) {
            System.out.println(i + ".- Empleado: " + listaEmpleado.get(i).getCedulaEmpleado()
                    + "  " + listaEmpleado.get(i).getNombreEmpleado()
                    + "  " + listaEmpleado.get(i).getApellidoEmpleado());
        }
        try {
            opcion = Lectura_Datos.leerInt("Seleccione el número "
                    + "de empleado a eliminar [0-" + (listaEmpleado.size() - 1) + "]");
            listaEmpleado.remove(opcion);
             Consola.notificarÉxito("***** EMPLEADO ELINIMADO *****\n");
        } catch (Exception e) {
            Consola.notificarError("Error, no fue posible eliminar el empleado");
            Consola.notificarError("Código de error: " + e.getMessage());
        }

    }

    public void listarEmpleadoParametros(ArrayList<Empleado> lista) {
        System.out.println("** Lista empleados rango edaddes **");
        for (Empleado e : lista) {

            if (e.getEdadEmpleado() >= 21 && e.getEdadEmpleado() <= 35 && e.getGeneroEmpleado() == 'M') {

                System.out.print("Cedula: " + e.getCedulaEmpleado());
                System.out.print("Nombre: " + e.getNombreEmpleado());
                System.out.print("Apellido: " + e.getApellidoEmpleado());
                System.out.print("Edad: " + e.getEdadEmpleado());
                System.out.print("Genero: " + e.getGeneroEmpleado());
                System.out.println("Telefono: " + e.getTelefonoEmpleado());
            }
        }
        Consola.notificarÉxito("** EMPLEADO LISTADOS **\n");

    }

    public void listarEmpleadoNombre(ArrayList<Empleado> listaEmpleado) {
        boolean auxiliar = true;
        int valor = 0;
        System.out.println("** BUSCAR EMPLEADO **");
        char letra = Lectura_Datos.leerCaracter("Ingrese la inical ");
        for (Empleado e : listaEmpleado) {
            if (letra == e.getNombreEmpleado().charAt(0) || letra == e.getApellidoEmpleado().charAt(0)) {
                System.out.println(valor + "[ Empleado con cédula: " + e.getCedulaEmpleado());
                System.out.println("Nombre: " + e.getNombreEmpleado());
                System.out.println("Apellido: " + e.getApellidoEmpleado());
                System.out.println("Telefono: " + e.getTelefonoEmpleado());
                System.out.println("Edad: " + e.getEdadEmpleado());
                System.out.println("Sexo: " + e.getGeneroEmpleado());
                Consola.notificarÉxito("** EMPLEADO ENCONTRADO **\n");
                valor++;
                auxiliar = false;
                break;
            }
        }

        Consola.notificarError("** NO HAY COINCIDENCIAS **\n");

    }

    public void guardarInfornacion(ArrayList<Empleado> listaEmpleados) {
        File archivo = new File("C:\\Users\\USER\\Documents\\NetBeansProjects\\Proyecto_POO\\src/empleado.txt");
        PrintWriter escribir;
        try {
            escribir = new PrintWriter(archivo);
            listaEmpleados.forEach((empleado) -> {
                escribir.print(
                        empleado.getCedulaEmpleado() + ";"
                        + empleado.getNombreEmpleado() + ";"
                        + empleado.getApellidoEmpleado() + ";"
                        + empleado.getTelefonoEmpleado() + ";"
                        + empleado.getGeneroEmpleado() + ";"
                        + empleado.getEdadEmpleado() + ";");
            });
            escribir.close();
        } catch (FileNotFoundException e) {
        }
    }

    public static void asignarComputador(ArrayList<Empleado> listaEmpleados,
            ArrayList<Computador> listaComputador) {

        int opcionEmpleado = 0;
        int opcionComputador = 0;

        do {
        } while (opcionEmpleado <= 0 || opcionEmpleado >= listaEmpleados.size());
        do {
            Computador.listarComputador(listaComputador);
        } while (opcionComputador <= 0 || opcionComputador >= listaComputador.size());

        Computador computador = listaComputador.get(opcionEmpleado);
        listaEmpleados.get(opcionEmpleado).setTieneComputador(computador);
    }

    public String getCedulaEmpleado() {
        return cedulaEmpleado;
    }

    public void setCedulaEmpleado(String cedulaEmpleado) {
        this.cedulaEmpleado = cedulaEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getApellidoEmpleado() {
        return apellidoEmpleado;
    }

    public void setApellidoEmpleado(String apellidoEmpleado) {
        this.apellidoEmpleado = apellidoEmpleado;
    }

    public String getTelefonoEmpleado() {
        return telefonoEmpleado;
    }

    public void setTelefonoEmpleado(String telefonoEmpleado) {
        this.telefonoEmpleado = telefonoEmpleado;
    }

    public char getGeneroEmpleado() {
        return generoEmpleado;
    }

    public void setGeneroEmpleado(char generoEmpleado) {
        this.generoEmpleado = generoEmpleado;
    }

    public int getEdadEmpleado() {
        return edadEmpleado;
    }

    public void setEdadEmpleado(int edadEmpleado) {
        this.edadEmpleado = edadEmpleado;
    }

    public Computador getTieneComputador() {
        return tieneComputador;
    }

    public void setTieneComputador(Computador tieneComputador) {
        this.tieneComputador = tieneComputador;
    }
}
