package ada.septima.back.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;


public class ContentOmdb implements Serializable {

    @JsonIgnoreProperties
    private Integer id;
    private String title;
    private Integer year;
    private Integer duration;
    private String genre;
    private String director;
    private List<String> actors;
    private String plot;

    public ContentOmdb(){

    }

    @JsonCreator
    public ContentOmdb(@JsonProperty Integer id,
                       @JsonProperty String title,
                       @JsonProperty Integer year,
                       @JsonProperty Integer duration,
                       @JsonProperty String genre,
                       @JsonProperty String director,
                       @JsonProperty String actors,
                       @JsonProperty String plot){
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

    public List<String> getActors() {
        return actors;
    }

    public void setActors(List<String> actors) {
        this.actors = actors;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }
}