package hbtest;

import com.itcast.entity.Customer;
import com.itcast.entity.LinkMan;
import com.itcast.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;

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
            Customer customer = new Customer();
            customer.setCustName("百度");
            customer.setCustLevel("普通用户");
            customer.setCustSource("网络");
            customer.setCustPhone("110");
            customer.setCustMobile("999");

//            LinkMan linkMan = new LinkMan();
//            linkMan.setLkmName("小宏");
//            linkMan.setLkmGender("女");
//            linkMan.setLkmPhone("911");
//
//            customer.getSetLinkMan().add(linkMan);

            session.save(customer);
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
//        Customer customer = session.get(Customer.class, 1);
//        LinkMan linkMan = session.get(LinkMan.class, 1);
//
//        customer.getSetLinkMan().add(linkMan);
//        linkMan.setCustomer(customer);
        //提交事务
        transaction.commit();
        //关闭资源
        session.close();
        sessionFactory.close();
    }

}

