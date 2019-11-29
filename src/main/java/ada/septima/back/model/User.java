package ada.septima.back.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import java.io.Serializable;

public class User implements Serializable {

    @Autowired
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
