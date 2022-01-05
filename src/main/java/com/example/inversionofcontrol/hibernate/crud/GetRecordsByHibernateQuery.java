package com.example.inversionofcontrol.hibernate.crud;

import com.example.inversionofcontrol.hibernate.dao.StudentDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.swing.*;
import java.util.Iterator;
import java.util.List;

public class GetRecordsByHibernateQuery {

    public static void main(String[] args) {

        //Create Session Factory
        SessionFactory sessionFactory=new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(StudentDao.class)
                .buildSessionFactory();

        //Create Session
        Session session=sessionFactory.getCurrentSession();

        try{
            //start transaction of session
            session.beginTransaction();

            //Create sql type query and get results in list by list() method
            //Always give entity name here not a table name
            List<StudentDao> studentDaos=session.createQuery("from student_details").list();

            for(StudentDao studentDao:studentDaos){
                System.out.println(studentDao);
            }

            //Finish transaction of session
            //session.getTransaction().commit();
            System.out.println("Session over");

        }catch (Exception exception){
            exception.printStackTrace();
        }finally {
            //sessionFactory.close();
        }
    }
}
