package model;

import java.util.List;

abstract class ContenidoGeneral {

    private Integer duracion;
    private List<String> actores;
    private String genero;
    private String nombre;
    private List<ContenidoUnitario> repositorioDeContenidoUnitario;
    private Integer id;
    private Integer año;
    private String director;
    private List<ContenidoUnitario> contenidoUnitarioVisto;

    public ContenidoGeneral(Integer id, String nombre, Integer año, List<String> actores, Integer duracion, String genero, String director) {
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

    abstract Boolean fuisteVistoPor(Usuario unUsuario);

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
