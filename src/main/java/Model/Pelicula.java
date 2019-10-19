package Model;

import Model.ContenidoUnitario;

import java.util.List;

public class Pelicula extends ContenidoUnitario {

    public Pelicula(String nombre, List<String> actores, Integer duracion, String genero) {
        super(nombre, actores, duracion, genero);
    }
}
