package ada.septima.back.model;

import java.io.Serializable;

public class User implements Serializable {

    private Integer id;
    private String title;
    private Integer year;
    private Integer duration;
    private String genre;
    private String director;
    private String actor;
    private String plot;
    private String seasons;
    private Integer number;
    private Integer episodes;

    public User() {
    }

        public User(Integer id, String title, Integer year, Integer duration, String genre, String director,
                String actor, String plot, String seasons, Integer number, Integer episodes){

            this.setId(id);
            this.setTitle(title);
            this.setYear(year);
            this.setDuration(duration);
            this.setGenre(genre);
            this.setDirector(director);
            this.setActor(actor);
            this.setPlot(plot);
            this.setSeasons(seasons);
            this.setNumber(number);
            this.setEpisodes(episodes);
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

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
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

