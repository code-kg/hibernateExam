package Exam.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table (name = "posts")
public class Posts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "postName")
    private String name;
    @Column(name = "date")
    private Date date;
    @ManyToOne
    @JoinColumn(name = "users_id")
    private Users users;

    public Posts() {
    }

    public Posts(String name, Date date, Users users) {
        this.name = name;
        this.date = date;
        this.users = users;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Posts{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", users=" + users +
                '}';
    }
}
