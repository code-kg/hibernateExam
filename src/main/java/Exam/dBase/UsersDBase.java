package Exam.dBase;

import Exam.entity.Users;
import Exam.util.HibernateUtil;
import org.hibernate.Session;

import java.util.List;

public class UsersDBase {
    public static Users addUser(Users users) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(users);
        session.getTransaction().commit();
        session.close();
        return users;
    }
    public static List<Users> getUsersByAsc() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Users> users = session.createQuery("FROM Exam.entity.Users c ORDER BY :userName ASC").list();
        session.close();
        return users;
    }
    public static List<Users> getUsersByPosts() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Users> users = session.createQuery("FROM Exam.entity.Posts p ORDER BY :postName").list();
        session.close();
        return users;
    }

//    public static Users getUsersByIdWithMaxPosts(Integer id) {
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        Users department = session.get(Users.class, id);
//        session.close();
//        return department;
//    }
}
