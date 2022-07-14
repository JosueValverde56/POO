
package Intento_Proyecto_002;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Compra {
    
    private int fecha;
    private String descripcion;

    public static boolean esDia(int dia) {
        Scanner teclado = new Scanner(System.in);
        boolean val = false;
        if (dia >= 1 && dia <= 31) {
            val = true;
        }
        System.out.println(dia);
        val=teclado.equals(val);
        return val;
    }
    
    public static String leerCadena(String texto){
        Scanner teclado = new Scanner(System.in);
        String cadena;
        System.out.println(texto);
        cadena=teclado.nextLine();
        return cadena;
    }

    public static boolean esMes(int mes) {
        boolean val = false;
        if (mes >= 1 && mes <= 12) {
            val = true;
        }
        return val;
    }

    public static boolean esAnio(int año) {
        boolean val = false;
        String añoAux = String.valueOf(año);
        if (año <= 9999 && año > 0 && añoAux.length() == 4) {
            val = true;
        }
        return val;
    }
     public Compra ingresarCompra(Compra c) {

        Consola.notificarÉxito("***** INGRESAR COMPRA *****\n");
        Compra compra = new Compra();
        
        compra.setFecha(Lectura_Datos.leerInt("Ingrese el dia"));

        Consola.notificarÉxito("***** COMPRA INGRESADO *****\n");
        return compra;

    }
     
     
     public static String fechaCompra(String fecha) {
        System.out.println("Fecha con Formato dd/mm/yyyy");
        Scanner sc = new Scanner(System.in);
        String fecha = sc.nextLine();
        SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy");
        Date testDate = null;
        String date = fecha;
        try {
            testDate = df.parse(date);
            System.out.println("Fecha Ingresada: " + testDate);
        } catch (ParseException e) {
            System.out.println("Formano Incorrecto");
        }

        if (!df.format(testDate).equals(date)) {
            Consola.notificarError("Información Incorrecta!!");

        }
        Consola.notificarÉxito("Se ha registrado correctamente");
        return (date);

    }
     
       public Usuario crearPropietario(Usuario p) {
        System.out.println("***** CREAR USUARIO *****\n");
        Usuario pro = new Usuario();
        do {
            pro.setCedula(Lectura_Datos.leerCadena("Cedula: "));

            if (!esCedula(pro.cedula)) {
                Consola.notificarError("La Cédula Ingresada es Incorrecta");

            }
        } while (!esCedula(pro.cedula));
        pro.setNombre(Lectura_Datos.leerCadena("Nombre: "));

        do {
            pro.setTelefono(Lectura_Datos.leerCadena("Telefono: "));
            if (!esSoloNumeros(pro.telefono)) {
                Consola.notificarError("Digite Solo Numeros");
                

            }

        } while (!esSoloNumeros(pro.telefono));

        
        //pro.setFechaNacimiento(Lectura_Datos.leerCadena("Fecha Nacimiento: " + Usuario.fechaNacimiento(fechaNacimiento)));
         pro.setFechaNacimiento(Lectura_Datos.leerCadena(Usuario.fechaNacimiento(fechaNacimiento)));
        Consola.notificarÉxito("***** PROPIETARIO CREADO *****\n");

        return pro;
    }
    

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int isFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }  
}
