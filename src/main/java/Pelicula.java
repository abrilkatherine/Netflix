package main.java;

import java.util.List;

public class Pelicula extends ContenidoUnitario {

    //CONSTRUCTOR
    public Pelicula(String nombre, List<String> actores, Integer duracion, String genero) {
        super(nombre, actores, duracion, genero);
    }
}
