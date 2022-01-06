package com.example.inversionofcontrol.hibernate.crud.updatebyhibernatequery;

import com.example.inversionofcontrol.hibernate.crud.createsessionobjectofhibernate.CreateSessionObjectOfHibernateStudentDao;
import org.hibernate.Session;

public class UpdateByHibernateQuery {

    public static void main(String[] args) {

        CreateSessionObjectOfHibernateStudentDao createSessionObjectOfHibernate=new CreateSessionObjectOfHibernateStudentDao();

        //Create Session
        Session session=createSessionObjectOfHibernate.createSession();

        try{
            //start transaction of session
            session.beginTransaction();

            //Update by using createQuery() and executeUpdate() method
            session.createQuery("update student_details set email='avadh@7span.com'").executeUpdate();

            //Finish transaction of session
            session.getTransaction().commit();
            System.out.println("Session over");

        }catch (Exception exception){

        }finally {
            //sessionFactory.close();
        }
    }
}
