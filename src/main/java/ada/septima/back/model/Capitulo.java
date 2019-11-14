package ada.septima.back.model;

import java.util.List;

public class Capitulo extends ContenidoUnitario {

    private Serie miserie;

    public Capitulo(Integer id, String nombre, Integer year, List<String> actores, Integer duracion, String genero, String director, Serie miserie) {
        super(id, nombre, year, actores, duracion, genero, director);
        this.miserie=miserie;

    }

    public Serie getMiserie() {
        return miserie;
    }

    public void setMiserie(Serie miserie) {
        this.miserie = miserie;
    }

    @Override
    public ContenidoGeneral contenidoGeneralDelUnitario() {
        return this.miserie;
    }

    @Override
    public Boolean fuisteVistoPor(Usuario unUsuario) {
        return unUsuario.getContenidoUnitarioVisto().contains(this);
    }
}
