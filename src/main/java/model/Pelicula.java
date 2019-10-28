package model;

import java.util.List;

public class Pelicula extends Contenido {

    public Pelicula(String nombre, List<String> actores, Integer duracion, String genero) {
        super(nombre, actores, duracion, genero);
    }
}
