
import java.util.List;

public abstract class Contenido {

    private String nombre;
    private String genero;

    public Contenido(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
    }

    public abstract Integer getDuracion();

    public abstract List<String> getActores();

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public abstract Boolean fuisteVistoPor(Usuario unUsuario);

}
