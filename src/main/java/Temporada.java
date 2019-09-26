package main.java;

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
    public List<String> getActores() {
        //no entiendo bien esto, tambien lo googlee
        //MAP: ""pasa de un stream de capitulos a un stream de lista de actores""
        //FLATMAP: elimina la lista y me deja un stream de actores (strings)
        //DISTINCT: elimina duplicados
        //COLLECT: convierte el stream a lista

        return capitulos.stream()
                .map(capitulo -> capitulo.getActores())
                .flatMap(strings -> strings.stream())
                .distinct()
                .collect(Collectors.toList());
    }


    @Override
    public Integer getDuracion() {
        //MAP: convierte el stream de capitulos a un stream de duraciones de capitulos (Stream<Integer>)
        //REDUCE: hace una reduccion(de lista de Integer a un Integer solo) en este caso haciendo una sumantoria

        return capitulos.stream()
                .map(capitulo -> capitulo.getDuracion())
                .reduce(0, ((integer, integer2) -> integer + integer2));
    }
}
