
import java.util.List;

public abstract class Contenido {
    //como comparten atributos, metodos y algunas implementaciones de los metodos
    //lo pusimos como una clase abstracta y no como interface

    private String nombre;
    private String genero;

    public Contenido(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
    }

    //a todas las subclases les voy a preguntar la duracion/actores de la misma manera
    //pero cada subclase lo implementa de manera distinta
    public abstract Integer getDuracion();

    public abstract List<String> getActores();

    //a todas las subclases les voy a preguntar nombre/genero de la misma manera
    //y todas las subclases van a usar esta implementacion
    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }
}
