import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private String nombre;

    //hago que arranquen como listas vacias para que no me aparezca un NullPointerException
    private List<Contenido> contenidoVisto = new ArrayList<>();
    private List<Contenido> contenidoVistoCompleto = new ArrayList<>();


    //CONSTRUCTOR
    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    //GETTERS Y SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Contenido> getContenidoVisto() {
        return contenidoVisto;
    }

    public void setContenidoVisto(List<Contenido> contenidoVisto) {
        this.contenidoVisto = contenidoVisto;
    }

    public List<Contenido> getContenidoVistoCompleto() {
        return contenidoVistoCompleto;
    }

    public void setContenidoVistoCompleto(List<Contenido> contenidoVistoCompleto) {
        this.contenidoVistoCompleto = contenidoVistoCompleto;
    }

    //OTROS METODOS
    public void mirar(Contenido unContenido){
        contenidoVisto.add(unContenido);
        //TODO falta la logica para determinar si se agrega a la lista de contenidoVistoCompleto o no
        
        //tal vez saquemos la lista de contenidoVistoCompleto y calculamos en un metodo aparte si lo vio completo o no
    }
}
