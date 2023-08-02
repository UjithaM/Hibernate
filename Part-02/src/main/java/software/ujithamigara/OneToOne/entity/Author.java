package software.ujithamigara.OneToOne.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Author {
    @Id
    private String id;
    private  String name;

    @OneToOne
    private Author author;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public Author(String id, String name, String birthDay) {
        this.id = id;
        this.name = name;
        this.birthDay = birthDay;
    }

    public Author() {
    }

    private  String birthDay;
}
