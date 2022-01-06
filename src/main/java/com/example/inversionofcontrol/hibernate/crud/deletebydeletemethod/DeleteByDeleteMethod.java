package com.example.inversionofcontrol.hibernate.crud.deletebydeletemethod;

import com.example.inversionofcontrol.hibernate.crud.createsessionobjectofhibernate.CreateSessionObjectOfHibernateStudentDao;
import com.example.inversionofcontrol.hibernate.dao.StudentDao;
import org.hibernate.Session;

public class DeleteByDeleteMethod {

    public static void main(String[] args) {

        CreateSessionObjectOfHibernateStudentDao createSessionObjectOfHibernate=new CreateSessionObjectOfHibernateStudentDao();

        //Create Session
        Session session=createSessionObjectOfHibernate.createSession();

        try{
            //start transaction of session
            session.beginTransaction();

            //Get record by hard coded id
            StudentDao studentDao=session.get(StudentDao.class,101);
            System.out.println(studentDao);

            //Delete by delete() method
            session.delete(studentDao);

            //Finish transaction of session
            session.getTransaction().commit();
            System.out.println("Session over");

        }catch (Exception exception){

        }finally {
            //sessionFactory.close();
        }
    }
}
