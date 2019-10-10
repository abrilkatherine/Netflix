import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Serie extends Contenido {

    private List<Temporada> temporadas;

    //CONSTRUCTOR
    public Serie(String nombre, String genero, List<Temporada> temporadas) {
        super(nombre, genero);
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

    @Override
    public Integer getDuracion() {
        return temporadas.stream()
                .mapToInt(temporada -> temporada.getDuracion()).sum();
    }

    public Boolean fuisteVistoPor(Usuario unUsuario) {
        return temporadas.stream().allMatch(temporada -> temporada.fuisteVistoPor(unUsuario));
    }
}
