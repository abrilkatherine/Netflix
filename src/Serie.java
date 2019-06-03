import java.util.List;
import java.util.stream.Collectors;

public class Serie extends Contenido {

    private List<Temporada> temporadas;

    //CONSTRUCTOR
    public Serie(String nombre, String genero, List<Temporada> temporadas) {
        super(nombre, genero);
        this.temporadas = temporadas;
    }

    //METODOS
    public List<Temporada> getTemporadas() {
        return temporadas;
    }


    public List<String> getActores() {
        return temporadas.stream()
                .map(temporada -> temporada.getActores())
                .flatMap(strings -> strings.stream())
                .collect(Collectors.toList());
    }


    @Override
    public Integer getDuracion() {
        //TODO HACER EL METODO RARO
        return null;
    }

}
