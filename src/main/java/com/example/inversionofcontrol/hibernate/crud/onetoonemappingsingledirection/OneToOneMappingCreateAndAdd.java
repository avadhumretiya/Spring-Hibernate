package com.example.inversionofcontrol.hibernate.crud.onetoonemappingsingledirection;

import com.example.inversionofcontrol.hibernate.crud.createsessionobjectofhibernate.CreateSessionObjectOfHibernateInstructorDao;
import com.example.inversionofcontrol.hibernate.dao.InstructorDao;
import com.example.inversionofcontrol.hibernate.dao.InstructorDetailDao;
import org.hibernate.Session;

public class OneToOneMappingCreateAndAdd {

    public static void main(String[] args) {

        CreateSessionObjectOfHibernateInstructorDao createSessionObjectOfHibernateInstructorDao=new CreateSessionObjectOfHibernateInstructorDao();

        //Create Session
        Session session=createSessionObjectOfHibernateInstructorDao.createSession();

        try{
            //Create a dao object with constructor to set values of fields
            //Or we can use setters to set values of fields
            InstructorDao instructorDao=new InstructorDao("avadh","umretiya","avadh@7span.com");
            InstructorDetailDao instructorDetailDao=new InstructorDetailDao("www.youtube.com","travelling");

            //associate objects
            instructorDao.setInstructorDetailDao(instructorDetailDao);

            //start transaction of session
            session.beginTransaction();

            //Save object or insert into table
            //Here only we are saving instructor object but automatically instructorDetail object save
            //Because we are providing cascading
            session.save(instructorDao);

            //Finish transaction of session
            session.getTransaction().commit();
            System.out.println("Session over");

        }catch (Exception exception){
            exception.printStackTrace();
        }finally {
            //sessionFactory.close();
        }
    }
}
