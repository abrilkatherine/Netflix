package model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Usuario {

   private String nombre;
   private List<Contenido> contenidoVisto;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.contenidoVisto = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Contenido> getContenidoVisto() {
        return contenidoVisto;
    }

    public void mirar(Contenido unContenido){
        contenidoVisto.add(unContenido);
    }

    public Boolean vioContenidoCompleto(Contenido unContenido){
        return unContenido.fuisteVistoPor(this);
    }
    public Integer minutosVistosDe(String genero){
        return this.getContenidoVisto().stream().filter(c->c.getGenero().equals(genero)).mapToInt(c->c.getDuracion()).sum();
    }
    public List<String> generosVistosSinRepeticion() {
        return this.contenidoVisto.stream().map(c -> c.getGenero()).distinct().collect(Collectors.toList());
    }
    public String generoPreferido(){
        return this.generosVistosSinRepeticion().stream().max(Comparator.comparing(genero->this.minutosVistosDe(genero))).get();
        }
}

