package Ejercicio_Herencia_02;

import Lectura_Datos.Consola;
import java.util.Scanner;

public class Clasificador {

    Scanner teclado = new Scanner(System.in);

    protected String cadena;

    public Clasificador() {
        System.out.println("\n********************");
        Consola.notificarÉxito("****CLASIFICADOR****");
        System.out.println("********************\n");
    }

    public Clasificador(String nombre) {

        this.cadena = nombre;
    }

    public void metodoClasificador() {

        char distinto = 0;
        do {
            System.out.print("Introducir Cadena: ");

            char[] numeros = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

            char[] signos = {'|', '!', '@', '€', '$', '/', '%', '#'};

            char[] vocales = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};

            char[] consonantes = {'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M',
                'N', 'P', 'Q', 'R', 'T', 'T', 'V', 'W', 'X', 'Y', 'Z', 'b', 'c', 'd',
                'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v',
                'w', 'x', 'y', 'z'};

            String vocal = "";
            String consonante = "";
            String signo = "";
            String numero = "";

            cadena = teclado.nextLine();

            for (int i = 0; i < cadena.length(); i++) {

                for (int a = 0; a < vocales.length; a++) {
                    if (cadena.charAt(i) == vocales[a]) {
                        vocal += cadena.charAt(i);
                    }
                }
                for (int a = 0; a < consonantes.length; a++) {
                    if (cadena.charAt(i) == consonantes[a]) {
                        consonante += cadena.charAt(i);
                    }
                }
                for (int x = 0; x < signos.length; x++) {
                    if (cadena.charAt(i) == signos[x]) {
                        signo += cadena.charAt(i);
                    }
                }
                for (int c = 0; c < numeros.length; c++) {
                    if (cadena.charAt(i) == numeros[c]) {
                        numero += cadena.charAt(i);
                    }
                }
            }
            Consola.notificarÉxito("'" + consonante + "<>" + vocal + "<>" 
                    + numero + signo + "'");

        } while (cadena.length() != cadena.charAt(distinto));

        System.out.println();
    }
    public String getCadena() {
        return cadena;
    }
    public void setCadena(String cadena) {
        this.cadena = cadena;
    }
}
