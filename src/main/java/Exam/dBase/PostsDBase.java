package Exam.dBase;

import Exam.entity.Posts;
import Exam.entity.Users;
import Exam.util.HibernateUtil;
import org.hibernate.Session;

public class PostsDBase {
    public static Users addPost(Users posts) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(posts);
        session.getTransaction().commit();
        session.close();
        return posts;
    }

    public static Posts getById(Integer id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Posts department = session.get(Posts.class, id);
        session.close();
        return department;
    }

}
