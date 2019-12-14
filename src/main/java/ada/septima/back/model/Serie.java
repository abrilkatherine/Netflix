package ada.septima.back.model;

import java.util.List;
import java.util.stream.Collectors;

public class Serie extends ContenidoGeneral  {

    private List<Temporada> temporadas;
    private String nombre;
    private String genero;

    public Serie(Integer id, String nombre, Integer año,  String genero, List<Temporada> temporadas, String director,
                 String plot) {
        super(id, nombre, año, null, null, genero,  director, plot);
        this.temporadas = temporadas;
    }

    public List<Temporada> getTemporadas() {
        return temporadas;
    }

    public List<String> getActores() {

        return temporadas.stream()
                .map(temporada -> temporada.getActores())
                .flatMap(strings -> strings.stream())
                .distinct()
                .collect(Collectors.toList());
    }
    public Integer getDuracion() {
        return temporadas.stream()
                .mapToInt(temporada -> temporada.getDuracion()).sum();
    }

    public Boolean fuisteVistoPor(Usuario unUsuario) {
        return temporadas.stream().allMatch(temporada -> temporada.fuisteVistoPor(unUsuario));
    }
}
