package Exam.entity;

import javax.persistence.*;

@Entity
@Table
public class Likes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column (name = "like")
    private Integer like;
    @ManyToOne
    @JoinColumn(name = "posts_id")
    private Posts posts;
    @ManyToOne
    @JoinColumn(name = "users_id")
    private Users users;

    public Likes() {
    }

    public Likes(Integer like, Posts posts, Users users) {
        this.like = like;
        this.posts = posts;
        this.users = users;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLike() {
        return like;
    }

    public void setLike(Integer like) {
        this.like = like;
    }

    public Posts getPosts() {
        return posts;
    }

    public void setPosts(Posts posts) {
        this.posts = posts;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Likes{" +
                "id=" + id +
                ", like=" + like +
                ", posts=" + posts +
                ", users=" + users +
                '}';
    }
}
