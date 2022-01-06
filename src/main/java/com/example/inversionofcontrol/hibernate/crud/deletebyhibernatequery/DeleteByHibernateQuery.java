package com.example.inversionofcontrol.hibernate.crud.deletebyhibernatequery;

import com.example.inversionofcontrol.hibernate.crud.createsessionobjectofhibernate.CreateSessionObjectOfHibernateStudentDao;
import org.hibernate.Session;

public class DeleteByHibernateQuery {

    public static void main(String[] args) {

        CreateSessionObjectOfHibernateStudentDao createSessionObjectOfHibernate=new CreateSessionObjectOfHibernateStudentDao();

        //Create Session
        Session session=createSessionObjectOfHibernate.createSession();

        try{
            //start transaction of session
            session.beginTransaction();

            //Delete by createQuery() and executeUpdate() methods
            session.createQuery("delete from student_details where id=102").executeUpdate();

            //Finish transaction of session
            session.getTransaction().commit();
            System.out.println("Session over");

        }catch (Exception exception){

        }finally {
            //sessionFactory.close();
        }
    }
}
