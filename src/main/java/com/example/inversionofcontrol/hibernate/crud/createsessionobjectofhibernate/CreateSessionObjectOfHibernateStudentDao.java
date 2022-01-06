package com.example.inversionofcontrol.hibernate.crud.createsessionobjectofhibernate;

import com.example.inversionofcontrol.hibernate.dao.StudentDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateSessionObjectOfHibernateStudentDao {

    public Session createSession(){

        //Create Session Factory
        SessionFactory sessionFactory=new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(StudentDao.class)
                .buildSessionFactory();

        //Create Session
        Session session=sessionFactory.getCurrentSession();
        return session;
    }
}
