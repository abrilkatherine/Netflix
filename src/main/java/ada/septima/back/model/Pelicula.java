package ada.septima.back.model;

import java.util.List;

public class Pelicula extends ContenidoUnitario {

    public Pelicula(Integer id, String nombre, Integer year, List<String> actores, Integer duracion, String genero, String director) {
        super(id, nombre, year, actores, duracion, genero, director);
    }

    @Override
    ContenidoGeneral contenidoGeneralDelUnitario() {
        return this;
    }

}
