package com.example.inversionofcontrol.hibernate.crud.getrecordsbyhibernatequery;

import com.example.inversionofcontrol.hibernate.crud.createsessionobjectofhibernate.CreateSessionObjectOfHibernateStudentDao;
import com.example.inversionofcontrol.hibernate.dao.StudentDao;
import org.hibernate.Session;

import java.util.List;

public class GetRecordsByHibernateQuery {

    public static void main(String[] args) {

        CreateSessionObjectOfHibernateStudentDao createSessionObjectOfHibernate=new CreateSessionObjectOfHibernateStudentDao();

        //Create Session
        Session session=createSessionObjectOfHibernate.createSession();

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
