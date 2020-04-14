package Exam.entity;

import javax.persistence.*;

@Entity
@Table (name = "followers")
public class Followers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column (name = "name")
    private String name;

    public Followers() {
    }

    public Followers(String name) {
        this.name = name;
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
