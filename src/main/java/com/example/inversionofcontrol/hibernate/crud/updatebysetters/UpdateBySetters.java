package com.example.inversionofcontrol.hibernate.crud.updatebysetters;

import com.example.inversionofcontrol.hibernate.crud.createsessionobjectofhibernate.CreateSessionObjectOfHibernateStudentDao;
import com.example.inversionofcontrol.hibernate.dao.StudentDao;
import org.hibernate.Session;

public class UpdateBySetters {

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

            //Update email address of record by setter
            //No need to use update query
            //When we commit the transaction at that time automatically record updated in database
            studentDao.setEmail("avadh@7span.com");

            //Finish transaction of session
            session.getTransaction().commit();
            System.out.println("Session over");

        }catch (Exception exception){

        }finally {
            //sessionFactory.close();
        }
    }
}
