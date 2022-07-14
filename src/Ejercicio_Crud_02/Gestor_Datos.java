
package Ejercicio_Crud_02;

import java.util.Scanner;

public class Gestor_Datos {
       
    //Lectura y retorno de tipo de datos String
    public static String leerCadena(String texto){
        Scanner teclado = new Scanner(System.in);
        String cadena;
        System.out.println(texto);
        cadena=teclado.nextLine();
        return cadena;
    }
    
    public static String leerCadena(String texto, String texto2){
        Scanner teclado = new Scanner(System.in);
        String cadena;
        System.out.println(texto+"\n"+texto2);
        cadena=teclado.nextLine();
        return cadena;
    }
    
    public static String leerCadena(){
        Scanner teclado = new Scanner(System.in);
        String cadena;
        System.out.println("Ingrese una cadena ");
        cadena=teclado.nextLine();
        return cadena;
    }
    //Lectura y retorno de tipo de datos char    
    public static char leerCaracter(String texto){
        char caracter='s';
        boolean incorrecto=true;
        while (incorrecto) {            
            Scanner teclado = new Scanner(System.in);
            String palabra;
            System.out.println(texto);
            palabra=  teclado.nextLine();
            if (palabra.length()==1) {
                caracter=palabra.charAt(0);
                incorrecto=false;
            }else{
                System.out.println("Se detectaron 0 o mas de 2 caracteres");
            }
        }
        return caracter;
    }
    //Lectura y retorno de tipo de datos double
    //Try catch para controlar que se ingrese solo datos decimales
    public static double leerDouble(String texto){
        double numero=0;
        boolean incorrecto=true;
        while(incorrecto){
            try {
                Scanner teclado = new Scanner(System.in);
                System.out.println(texto);
                numero = teclado.nextDouble();
                //cambio de condición para que salga del ciclo
                incorrecto=false;
            } catch (Exception e) {
                System.out.println("Debe ingresar un número decimal");
            } 
        }
        return numero;
    }
    
    public static double leerDouble(){
        double numero=0;
        boolean incorrecto=true;
        while(incorrecto){
            try {
                Scanner teclado = new Scanner(System.in);
                System.out.println("Ingrese un valor decimal ");
                numero = teclado.nextDouble();
                //cambio de condición para que salga del ciclo
                incorrecto=false;
            } catch (Exception e) {
                System.out.println("Debe ingresar un número decimal");
            } 
        }
        return numero;
    }
    
    //Lectura y retorno de tipo de datos float
    public static float leerFloat(String texto){
        float numero=0;
        boolean incorrecto=true;
        while(incorrecto){
            try {
                Scanner teclado = new Scanner(System.in);
                System.out.println(texto);
                numero = teclado.nextFloat();
                //cambio de condición para que salga del ciclo
                incorrecto=false;
            } catch (Exception e) {
                System.out.println("Debe ingresar un número decimal");
            } 
        }
        return numero;
    }
    //Lectura y retorno de tipo de datos int
    public static int leerInt(String texto){
        int numero=0;
        boolean incorrecto=true;
        while(incorrecto){
            try {
                Scanner teclado = new Scanner(System.in);
                System.out.println(texto);
                numero = teclado.nextInt();
                //cambio de condición para que salga del ciclo
                incorrecto=false;
            } catch (Exception e) {
                System.out.println("Debe ingresar un número entero");
            } 
        }
        return numero;
    }
    
    public static int leerInt(){
        int numero=0;
        boolean incorrecto=true;
        while(incorrecto){
            try {
                Scanner teclado = new Scanner(System.in);
                System.out.println("Ingrese un entero");
                numero = teclado.nextInt();
                //cambio de condición para que salga del ciclo
                incorrecto=false;
            } catch (Exception e) {
                System.out.println("Debe ingresar un número entero");
            } 
        }
        return numero;
    }
    //Lectura y retorno de tipo de datos byte
    public static byte leerByte(){
        byte numero=0;
        boolean incorrecto=true;
        while(incorrecto){
            try {
                Scanner teclado = new Scanner(System.in);
                System.out.println("Ingrese un entero");
                numero = teclado.nextByte();
                //cambio de condición para que salga del ciclo
                incorrecto=false;
            } catch (Exception e) {
                System.out.println("Debe ingresar un entero");
            } 
        }
        return numero;
    }
    //Lectura y retorno de tipo de datos boolean
  
    public static boolean leerBoolean(){
        boolean condicion=false;
        boolean incorrecto=true;
        while(incorrecto){
            try {
                Scanner teclado = new Scanner(System.in);
                System.out.println("Ingrese un booleano");
                condicion = teclado.nextBoolean();
                //cambio de condición para que salga del ciclo
                incorrecto=false;
            } catch (Exception e) {
                System.out.println("Debe ingresar un booleano");
            } 
        }
        return condicion;
    }
}

