
package Ejercicio_Crud_01;

import Ejercicio_Crud_03.Lectura_Datos;
import java.util.ArrayList;

public class Empleado {
     private String cedula;
    private String nombre;
    private String apellido;
    private String telefono;
    private int edad;
    private char sexo;

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Empleado crearEmpleado() {
        Empleado empleado = new Empleado();
        System.out.println("***** CREACIÓN EMPLEADO *****");
        
        empleado.setCedula(Lectura_Datos.leerCadena("Ingrese la cédula del empleado:"));
        empleado.setNombre(Lectura_Datos.leerCadena("Ingrese el nombre del empleado:"));
        empleado.setApellido(Lectura_Datos.leerCadena("Ingrese el apellido del empleado:"));
        empleado.setTelefono(Lectura_Datos.leerCadena("Ingrese el telefono del empleado:"));
        empleado.setEdad(Lectura_Datos.leerInt("Ingrese la edad del empleado:"));
        char auxiliarSexo;
        do {
            auxiliarSexo = Lectura_Datos.leerCaracter("Ingrese el sexo del empleado [M/F]:");
        } while (auxiliarSexo != 'M' && auxiliarSexo != 'F');
        empleado.setSexo(auxiliarSexo);
        System.out.println("***** EMPLEADO CREADO *****\n");
        return empleado;
    }

    public void modificarEmpleado(ArrayList<Empleado> listaEmpleado) {
        boolean auxiliar = true;
        System.out.println("***** MODIFICAR EMPLEADO *****");
        String cedula = Lectura_Datos.leerCadena("Ingrese la cédula del empleado "
                + "que desea modificar ");
        for (Empleado empleado : listaEmpleado) {
            if (cedula.equals(empleado.getCedula())) {
                System.out.println("Empleado con cédula: " + empleado.getCedula());
                System.out.println("Nombre anterior: " + empleado.getNombre());
                empleado.setNombre(Lectura_Datos.leerCadena("Nuevo nombre:"));
                System.out.println("Apellido anterior: " + empleado.getApellido());
                empleado.setApellido(Lectura_Datos.leerCadena("Nuevo apellido:"));
                System.out.println("Telefono anterior: " + empleado.getTelefono());
                empleado.setTelefono(Lectura_Datos.leerCadena("Nuevo telefono:"));
                System.out.println("Edad anterior: " + empleado.getEdad());
                empleado.setEdad(Lectura_Datos.leerInt("Nueva edad:"));
                System.out.println("Sexo anterior: " + empleado.getSexo());
                empleado.setSexo(Lectura_Datos.leerCaracter("Nuevo sexo [M/F]:"));
                System.out.println("***** EMPLEADO MODIFICADO *****\n");
                auxiliar = false;
                break;
            }
        }

        if (auxiliar) {
            System.out.println("***** NO HAY MODIFICACIONES *****\n");
        }

    }

    public void listarEmpleadoCedula(ArrayList<Empleado> listaEmpleado) {
        boolean auxiliar = true;
        System.out.println("***** BUSCAR EMPLEADO *****");
        String cedula = Lectura_Datos.leerCadena("Ingrese la cédula del empleado ");
        for (Empleado empleado : listaEmpleado) {
            if (cedula.equals(empleado.getCedula())) {
                System.out.println("Empleado con cédula: " + empleado.getCedula());
                System.out.println("Nombre: " + empleado.getNombre());
                System.out.println("Apellido: " + empleado.getApellido());
                System.out.println("Telefono: " + empleado.getTelefono());
                System.out.println("Edad: " + empleado.getEdad());
                System.out.println("Sexo: " + empleado.getSexo());
                System.out.println("***** EMPLEADO ENCONTRADO *****\n");
                auxiliar = false;
                break;
            }
        }
        if (auxiliar) {
            System.out.println("***** NO HAY COINCIDENCIAS *****\n");
        }
    }

    public void listarEmpleadoGenero(ArrayList<Empleado> listaEmpleado) {
        boolean auxiliar = true;
        System.out.println("***** BUSCAR EMPLEADO POR GENERO*****");
        char sexo = Lectura_Datos.leerCaracter("Ingrese el genero que desea buscar [M/F]");
        for (Empleado empleado : listaEmpleado) {
            if (sexo == empleado.getSexo()) {
                System.out.println("Empleado con cédula: " + empleado.getCedula());
                System.out.println("Nombre: " + empleado.getNombre());
                System.out.println("Apellido: " + empleado.getApellido());
                System.out.println("Telefono: " + empleado.getTelefono());
                System.out.println("Edad: " + empleado.getEdad());
                System.out.println("Sexo: " + empleado.getSexo());
                auxiliar = false;
            }
        }
        if (auxiliar) {
            System.out.println("***** NO HAY COINCIDENCIAS *****\n");
        } else {
            System.out.println("***** EMPLEADO ENCONTRADO *****\n");
        }
    }

    public void listarEmpleadoGeneroEdad(ArrayList<Empleado> listaEmpleado) {
        boolean auxiliar = true;
        System.out.println("***** BUSCAR EMPLEADO POR GENERO Y EDAD*****");
        for (Empleado empleado : listaEmpleado) {
            if (empleado.getSexo()=='M' && (empleado.getEdad()>=21 && empleado.getEdad()<=35)) {
                System.out.println("Empleado con cédula: " + empleado.getCedula());
                System.out.println("Nombre: " + empleado.getNombre());
                System.out.println("Apellido: " + empleado.getApellido());
                System.out.println("Telefono: " + empleado.getTelefono());
                System.out.println("Edad: " + empleado.getEdad());
                System.out.println("Sexo: " + empleado.getSexo());
                auxiliar = false;
            }
        }
        if (auxiliar) {
            System.out.println("***** NO HAY COINCIDENCIAS *****\n");
        } else {
            System.out.println("***** EMPLEADO ENCONTRADO *****\n");
        }
    }

    public void eliminarEmpleado(ArrayList<Empleado> listaEmpleado) {
        int opcion;
        System.out.println("***** ELIMINAR EMPLEADO *****");
        for (int i = 0; i < listaEmpleado.size(); i++) {
            System.out.println(i + ".- Empleado: " + listaEmpleado.get(i).getCedula()
                    + "  " + listaEmpleado.get(i).getNombre()
                    + "  " + listaEmpleado.get(i).getApellido());
        }
        try {
            opcion = Lectura_Datos.leerInt("Seleccione el número "
                    + "de empleado a eliminar [0-" + (listaEmpleado.size() - 1) + "]");
            listaEmpleado.remove(opcion);
            System.out.println("***** EMPLEADO ELIMINADO*****");
        } catch (Exception e) {
            System.out.println("Error, no fue posible eliminar el empleado");
            System.out.println("Código de error: " + e.getMessage());
        }

    }

    public void listarEmpleado(ArrayList<Empleado> listaEmpleado) {
        System.out.println("***** LISTAR EMPLEADO *****");
        for (Empleado empleado : listaEmpleado) {
            System.out.println("Cedula: " + empleado.getCedula());
            System.out.println("Nombre: " + empleado.getNombre());
            System.out.println("Apellido: " + empleado.getApellido());
            System.out.println("Telefono: " + empleado.getTelefono());
            System.out.println("Edad: " + empleado.getEdad());
            System.out.println("Sexo: " + empleado.getSexo());
            System.out.println("");
        }
        System.out.println("***** EMPLEADO LISTADOS *****\n");
    }
}
