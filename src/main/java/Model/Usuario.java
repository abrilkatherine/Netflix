package Model;

import Model.Contenido;

import java.util.ArrayList;
import java.util.List;

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
}
