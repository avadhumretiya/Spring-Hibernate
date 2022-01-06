package com.example.inversionofcontrol.hibernate.crud.createsessionobjectofhibernate;

import com.example.inversionofcontrol.hibernate.dao.InstructorDao;
import com.example.inversionofcontrol.hibernate.dao.InstructorDaoBiDirectional;
import com.example.inversionofcontrol.hibernate.dao.InstructorDetailDao;
import com.example.inversionofcontrol.hibernate.dao.InstructorDetailDaoBiDirectional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateSessionObjectOfHibernateInstructorDaoBiDirectional {

    public Session createSession(){

        //Create Session Factory
        SessionFactory sessionFactory=new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(InstructorDaoBiDirectional.class)
                .addAnnotatedClass(InstructorDetailDaoBiDirectional.class)
                .buildSessionFactory();

        //Create Session
        Session session=sessionFactory.getCurrentSession();
        return session;
    }
}
