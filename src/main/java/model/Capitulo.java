package model;

import java.util.List;

public class Capitulo extends ContenidoUnitario {

    public Capitulo(Integer id, String nombre, Integer year, List<String> actores, Integer duracion, String genero, String director) {
        super(id, nombre, year, actores, duracion, genero, director);
    }
}
