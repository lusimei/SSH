package cn.itcast.dao;

import cn.itcast.entity.Customer;
import cn.itcast.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class CustomerDaoImpl implements CustomerDao {

    public List<Customer> findAll() {
        List<Customer> list = null;
        SessionFactory sessionFactory = null;
        Session session = null;
        Transaction transaction = null;
        try {
            sessionFactory = HibernateUtils.getSessionFactory();
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            Query query = session.createQuery("from Customer");
            list = query.list();
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        } finally {
            session.close();
//            sessionFactory.close();
        }
        return list;
    }
}
