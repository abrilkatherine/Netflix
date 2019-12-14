package ada.septima.back.model;

import java.util.List;

public class Pelicula extends ContenidoUnitario {

    public Pelicula(Integer id, String nombre, Integer year, List<String> actores, Integer duracion, String genero, String director, String plot) {
        super(id, nombre, year, actores, duracion, genero, director, plot);
    }

    @Override
    public ContenidoGeneral contenidoGeneralDelUnitario() {
        return this;
    }

}
