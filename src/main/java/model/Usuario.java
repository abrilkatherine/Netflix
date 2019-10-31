package model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Usuario {

   private String nombre;
   private List<ContenidoUnitario> contenidoUnitarioVisto;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.contenidoUnitarioVisto = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<ContenidoUnitario> getContenidoUnitarioVisto() {
        return contenidoUnitarioVisto;
    }

    public void mirar(ContenidoUnitario unContenidoUnitario){
        contenidoUnitarioVisto.add(unContenidoUnitario);
    }

    public Boolean vioContenidoCompleto(ContenidoGeneral unContenido){
        return unContenido.fuisteVistoPor(this);
    }

    public Integer minutosVistosDe(String genero){
        return this.getContenidoUnitarioVisto().stream().filter(c->c.getGenero().equals(genero)).mapToInt(c->c.getDuracion()).sum();
    }
    public boolean visteEsteContenidoCompleto(ContenidoUnitario unContenido){
        return contenidoUnitarioVisto.contains(unContenido);
    }


    public List<String> generosVistosSinRepeticion() {
        return this.contenidoUnitarioVisto.stream().map(c -> c.getGenero()).distinct().collect(Collectors.toList());
    }
    public String generoPreferido(){
        return this.generosVistosSinRepeticion().stream().max(Comparator.comparing(genero->this.minutosVistosDe(genero))).get();
        }
}

