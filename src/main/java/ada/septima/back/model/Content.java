package ada.septima.back.model;

import com.fasterxml.jackson.annotation.JsonCreator;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

public class Content implements Serializable {
    private Integer id;
    private String title;
    private Integer year;
    private Integer duration;
    private String genre;
    private String director;
    private List<String> actors;

    public Content(){

    }

    public Content(Integer id, String title, Integer year, Integer duration, String genre, String director,
                   List<String> actor){

        this. id=id;
        this.title=title;
        this.year=year;
        this.duration=duration; //Integer.valueOf(...)
        this.genre=genre;
        this.director=director;
        this.actors=actor;
        
    }
    @JsonCreator
    public Content(Integer id, String title, String year, String duration, String genre, String director,
                   String actor){

        this(id,title,Integer.valueOf(year), Integer.valueOf(duration.split("\\s")[0]), genre, director, Arrays.asList(actor.split(",")));
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public List<String> getActor() {
        return actors;
    }

    public Response contentToResponse(){

        Response newResponse = new Response(
                this.getId(),
                this.getTitle(),
                this.getYear(),this.getDuration(),
                this.getGenre(),this.getDirector(),this.getActor());
        return newResponse;
    }
}
