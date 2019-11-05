package ada.septima.back.model;

import java.io.Serializable;

public class User implements Serializable {

    private Integer id;
    private String name;

    public User() {
    }

    public User(Integer id, String name) {

        this.setId(id);
        this.setName(name);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
