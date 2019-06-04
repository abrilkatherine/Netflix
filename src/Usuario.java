import java.util.ArrayList;
import java.util.List;

public class Usuario {

   private String nombre;
   private List<Contenido> contenidoVisto;


   //OONSTRUCTOR
    public Usuario(String nombre) {
        this.nombre = nombre;
        this.contenidoVisto = new ArrayList<>();
    }

    //METODOS
    public String getNombre() {
        return nombre;
    }

    public List<Contenido> getContenidoVisto() {
        return contenidoVisto;
    }

    public void mirar(Contenido unContenido){
        contenidoVisto.add(unContenido);
    }
}
