package com.example.inversionofcontrol.hibernate.crud;

import com.example.inversionofcontrol.hibernate.dao.StudentDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateAndAddWithAutoIncreament {

    public static void main(String[] args) {

        //Create Session Factory
        SessionFactory sessionFactory=new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(StudentDao.class)
                .buildSessionFactory();

        //Create Session
        Session session=sessionFactory.getCurrentSession();

        try{
            //Create a dao object with constructor to set values of fields
            //Or we can use setters to set values of fields
            StudentDao studentDao=new StudentDao("hetvi","7span","hetvi@7span.com");
            StudentDao studentDao1=new StudentDao("akshay","7span","akshay@7span.com");
            StudentDao studentDao2=new StudentDao("hardik","7span","hardik@7span.com");
            System.out.println("Dao object created and set all the values of fields");

            //start transaction of session
            session.beginTransaction();

            //Save student object or insert into table
            session.save(studentDao);
            session.save(studentDao1);
            session.save(studentDao2);
            System.out.println("Insert or save Complete");

            //Finish transaction of session
            session.getTransaction().commit();
            System.out.println("Session over");

        }catch (Exception exception){

        }finally {
            //sessionFactory.close();
        }
    }
}
