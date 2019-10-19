package Model;

import Model.Contenido;
import Model.Usuario;

import java.util.List;
import java.util.stream.Collectors;

public class Temporada extends Contenido {

    private List<Capitulo> capitulos;

    public Temporada(String nombre, String genero, List<Capitulo> capitulos){
        super(nombre, genero);
        this.capitulos = capitulos;
    }

    public List<Capitulo> getCapitulos() {
        return capitulos;
    }

    @Override
    public List<String> getActores() {

        return capitulos.stream()
                .map(capitulo -> capitulo.getActores())
                .flatMap(strings -> strings.stream())
                .distinct()
                .collect(Collectors.toList());
    }

    @Override
    public Integer getDuracion() {

        return capitulos.stream()
                .map(capitulo -> capitulo.getDuracion())
                .reduce(0, ((integer, integer2) -> integer + integer2));
    }
    @Override
    public Boolean fuisteVistoPor(Usuario unUsuario) {
        return capitulos.stream().allMatch(capitulo -> capitulo.fuisteVistoPor(unUsuario));
    }
}
