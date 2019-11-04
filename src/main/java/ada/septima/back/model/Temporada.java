package ada.septima.back.model;

import java.util.List;
import java.util.stream.Collectors;

public class Temporada extends ContenidoGeneral {

    private List<Capitulo> capitulos;
    private String nombre;
    private String genero;

    public Temporada(String nombre, String genero, List<Capitulo> capitulos){
        super(null, nombre, null, null, null, genero, null);
        this.capitulos=capitulos;
    }

    public List<Capitulo> getCapitulos() {
        return capitulos;
    }

    public List<String> getActores() {

        return capitulos.stream()
                .map(capitulo -> capitulo.getActores())
                .flatMap(strings -> strings.stream())
                .distinct()
                .collect(Collectors.toList());
    }

    public Integer getDuracion() {

        return capitulos.stream()
                .map(capitulo -> capitulo.getDuracion())
                .reduce(0, ((integer, integer2) -> integer + integer2));
    }
    public Boolean fuisteVistoPor(Usuario unUsuario) {
        return capitulos.stream().allMatch(capitulo -> capitulo.fuisteVistoPor(unUsuario));
    }
}
