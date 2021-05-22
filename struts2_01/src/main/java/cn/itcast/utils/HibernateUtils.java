package cn.itcast.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {

    private static final Configuration configuration;
    private static final SessionFactory sessionFactory;

    static {
        configuration = new Configuration();
        configuration.configure();
        sessionFactory = configuration.buildSessionFactory();
    }

    public static Session getCurrentSession(){
        return sessionFactory.getCurrentSession();
    }

    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }

}
