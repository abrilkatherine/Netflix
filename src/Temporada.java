import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Temporada extends Contenido {

    private List<Capitulo> capitulos;

    //CONSTRUCTOR
    public Temporada(String nombre, String genero, List<Capitulo> capitulos){
        super(nombre, genero);
        this.capitulos = capitulos;
    }

    //METODOS
    public List<Capitulo> getCapitulos() {
        return capitulos;
    }

    @Override
    public Integer getDuracion() {
        //TODO
        return null;
    }

    @Override
    public List<String> getActores() {
        //no entiendo bien esto, tambien lo googlee
        return capitulos.stream()
                .map(capitulo -> capitulo.getActores())
                .flatMap(strings -> strings.stream())
                .collect(Collectors.toList());
    }

}
