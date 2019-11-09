package ada.septima.back.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Usuario {

   private String nombre;
   private List<ContenidoUnitario> contenidoUnitarioVisto;
   private List<ContenidoGeneral> contenidoVistoCompleto = new ArrayList<ContenidoGeneral>();

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.setContenidoUnitarioVisto(new ArrayList<>());
    }

    public String getNombre() {
        return nombre;
    }

    public List<ContenidoUnitario> getContenidoUnitarioVisto() {
        return contenidoUnitarioVisto;
    }

    public void mirar(ContenidoUnitario unContenidoUnitario){
        getContenidoUnitarioVisto().add(unContenidoUnitario);
        if(this.vioContenidoCompleto(unContenidoUnitario.contenidoGeneralDelUnitario())){
            getContenidoVistoCompleto().add(unContenidoUnitario.contenidoGeneralDelUnitario());
        }
    }

    public Boolean vioContenidoCompleto(ContenidoGeneral unContenido){

        return unContenido.fuisteVistoPor(this);
    }

    public Integer minutosVistosDe(String genero){
        return this.getContenidoUnitarioVisto().stream().filter(c->c.getGenero().equals(genero)).mapToInt(c->c.getDuracion()).sum();
    }
    public boolean visteEsteContenidoCompleto(ContenidoUnitario unContenido){
        return getContenidoUnitarioVisto().contains(unContenido);
    }


    public List<String> generosVistosSinRepeticion() {
        return this.getContenidoUnitarioVisto().stream().map(c -> c.getGenero()).distinct().collect(Collectors.toList());
    }
    public String generoPreferido(){
        return this.generosVistosSinRepeticion().stream().max(Comparator.comparing(genero->this.minutosVistosDe(genero))).get();
        }

    public void setContenidoUnitarioVisto(List<ContenidoUnitario> contenidoUnitarioVisto) {
        this.contenidoUnitarioVisto = contenidoUnitarioVisto;
    }

    public List<ContenidoGeneral> getContenidoVistoCompleto() {
        return contenidoVistoCompleto;
    }

    public void setContenidoVistoCompleto(List<ContenidoGeneral> contenidoVistoCompleto) {
        this.contenidoVistoCompleto = contenidoVistoCompleto;
    }
}

