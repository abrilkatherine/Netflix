package model;

import java.io.Serializable;
import java.util.List;

public class Content implements Serializable {
    private Integer id;
    private String title;
    private Integer year;
    private Integer duration;
    private String genre;
    private String director;
    private List<String> actors;
    private String plot;
    private String seasons;
    private Integer number;
    private Integer episodes;

    public Content(){

    }

    public Content(Integer id, String title, Integer year, Integer duration, String genre, String director,
                   List<String> actor, String plot, String seasons, Integer number, Integer episodes){

        this. id=id;
        this.title=title;
        this.year=year;
        this.duration=duration;
        this.genre=genre;
        this.director=director;
        this.actors=actor;
        this.plot=plot;
        this.seasons=seasons;
        this.number=number;
        this.episodes=episodes;
        
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

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public String getSeasons() {
        return seasons;
    }

    public void setSeasons(String seasons) {
        this.seasons = seasons;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getEpisodes() {
        return episodes;
    }

    public void setEpisodes(Integer episodes) {
        this.episodes = episodes;
    }
}
