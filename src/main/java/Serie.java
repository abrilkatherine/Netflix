package main.java;

import main.java.Temporada;

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
        //no entiendo bien esto, tambien lo googlee
        //MAP: ""pasa de un stream de temporadas a un stream de lista de actores""
        //FLATMAP: elimina la lista y me deja un stream de actores (strings)
        //DISTINCT: elimina duplicados
        //COLLECT: convierte el stream a lista

        return temporadas.stream()
                .map(temporada -> temporada.getActores())
                .flatMap(strings -> strings.stream())
                .distinct()
                .collect(Collectors.toList());
    }


    @Override
    public Integer getDuracion() {
        //MAP: convierte el stream de capitulos a un stream de duraciones de temporadas (Stream<Integer>)
        //REDUCE: hace una reduccion(de lista de Integer a un Integer solo) en este caso haciendo una sumantoria
        return temporadas.stream()
                .map(temporada -> temporada.getDuracion())
                .reduce(0, ((integer, integer2) -> integer + integer2));
    }

}
