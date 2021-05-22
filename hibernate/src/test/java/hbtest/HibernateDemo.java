package hbtest;

import com.itcast.entity.User;
import com.itcast.utils.HibernateUtils;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class HibernateDemo {

    @Test
    public void testAdd(){
//        SessionFactory sessionFactory = null;
        Session session = null;
        Transaction transaction = null;
        try {
//            sessionFactory = HibernateUtils.getSessionFactory();
            session = HibernateUtils.getCurrentSession();
            transaction = session.beginTransaction();
            User user = new User();
            user.setUsername("lucy");
            user.setPassword("123456");
            user.setAddress("china");
            session.save(user);
//            System.out.println(1/0);
            //提交事务
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        } finally {
            //关闭资源
            session.close();
//            sessionFactory.close();
        }
    }

    @Test
    public void testGet(){
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        //使用SessionFactory创建session对象
        //类型于java连接数据库的连接
        Session session = sessionFactory.openSession();
        //开启事务
        Transaction transaction = session.beginTransaction();
        //curd操作
//        Query query = session.createQuery("from User");
//        List<User> list = query.list();
//        Criteria criteria = session.createCriteria(User.class);
//        System.out.println(criteria.list());
        NativeQuery sqlQuery = session.createSQLQuery("SELECT * FROM hibernate_day01.t_user");
        sqlQuery.addEntity(User.class);
        List<User> list = sqlQuery.list();
        System.out.println(list);
        //提交事务
        transaction.commit();
        //关闭资源
        session.close();
        sessionFactory.close();
    }

}

