package ada.septima.back.model;

import java.util.List;
import java.util.stream.Collectors;

public class Temporada extends ContenidoGeneral {

    private Integer id;
    private String name;
    private String director;
    private Integer año;
    private String plot;
    private List<Capitulo> capitulos;
    private String nombre;
    private String genero;
    private Serie miserie;

    public Temporada(String nombre, String genero, List<Capitulo> capitulos, String plot){
        super(null, nombre, null, null, null, genero, null, plot);
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

    public Serie getMiserie() {
        return miserie;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getDirector() {
        return director;
    }

    @Override
    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public Integer getAño() {
        return año;
    }

    @Override
    public void setAño(Integer año) {
        this.año = año;
    }
}
