package com.example.inversionofcontrol.hibernate.crud.createandinsert;

import com.example.inversionofcontrol.hibernate.crud.createsessionobjectofhibernate.CreateSessionObjectOfHibernateStudentDao;
import com.example.inversionofcontrol.hibernate.dao.StudentDao;
import org.hibernate.Session;

public class CreateAndInsert {

    public static void main(String[] args) {

        CreateSessionObjectOfHibernateStudentDao createSessionObjectOfHibernate=new CreateSessionObjectOfHibernateStudentDao();

        //Create Session
        Session session=createSessionObjectOfHibernate.createSession();

        try{
            //Create a dao object with constructor to set values of fields
            //Or we can use setters to set values of fields
            StudentDao studentDao=new StudentDao(102,"7span","7span","avadh@7span.com");
            System.out.println("Dao object created and set all the values of fields");

            //start transaction of session
            session.beginTransaction();

            //Save student object or insert into table
            session.save(studentDao);
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
