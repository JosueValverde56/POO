package Intento_Proyecto_001;

//https://github.com/atelporetti/Concesionaria-de-vehiculos-Ejercicio
//https://github.com/DiscoDurodeRoer/ejercicios-c-sharp-youtube/tree/master/poo/poo%2002/Ejercicio_POO_DDR_2/POO2
//https://www.youtube.com/watch?v=OG_HxXFx6Qk
//https://es.stackoverflow.com/questions/506559/herencia-entre-clases-de-java-concesionario-de-coches
//https://es.scribd.com/document/507424851/tarea-13-de-taller-de-programacion
//https://www.clubensayos.com/Tecnología/Ejercicios-de-programación-orientada-a-objetos/2850783.html
//https://slideplayer.es/slide/4620836/
//https://cicloinformatico.files.wordpress.com/2011/03/ejercicios_resueltos.pdf
public class Coche {

    protected int _id;
    protected String _marca;
    protected String _modelo;
    protected int _km;
    protected double _precio;

    public Coche(int id, String marca, String modelo, int km, double precio) {
        this._id = id;
        this._marca = marca;
        this._modelo = modelo;
        this._km = km;
        this._precio = precio;
    }
}
