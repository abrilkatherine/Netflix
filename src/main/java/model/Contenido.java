package model;

import java.util.List;

public abstract class Contenido {

    private Integer duracion;
    private List<String> actores;
    private String genero;
    private String nombre;
    private List<Contenido> repositorioDeContenido;
    private Integer id;
    private Integer año;
    private String director;

    public Contenido(Integer id, String nombre, Integer año, List<String> actores, Integer duracion, String genero, String director) {
        this.setNombre(nombre);
        this.setId(id);
        this.setGenero(genero);
        this.duracion = duracion;
        this.actores = actores;
        this.setAño(año);
        this.setDirector(director);
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAño() {
        return año;
    }

    public void setAño(Integer año) {
        this.año = año;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
