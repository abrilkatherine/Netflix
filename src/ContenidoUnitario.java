import java.util.List;

public abstract class ContenidoUnitario extends Contenido  {


    private Integer duracion;
    private List<String> actores;

    //CONSTRUCTOR

    public ContenidoUnitario(String nombre, List<String> actores, Integer duracion, String genero) {
        super(nombre, genero);
        this.duracion = duracion;
        this.actores = actores;
    }


    public List<String> getActores() {
        return actores;
    }

    public Integer getDuracion() {
        return duracion;
    }

}
