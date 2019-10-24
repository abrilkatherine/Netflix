package Model;

import java.util.List;

public abstract class Contenido {

    private Integer duracion;
    private List<String> actores;
    private String genero;
    private String nombre;
    private List<Contenido> repositorioDeContenido;

    //CONSTRUCTOR

    public Contenido(String nombre, List<String> actores, Integer duracion, String genero) {
        this.setNombre(nombre);
        this.setGenero(genero);
        this.duracion = duracion;
        this.actores = actores;
    }

    public List<String> getActores() {
        return actores;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void agregarContenidoARepo(){
        repositorioDeContenido.add(this);
    }

    public Boolean fuisteVistoPor(Usuario unUsuario) {
        return true;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
