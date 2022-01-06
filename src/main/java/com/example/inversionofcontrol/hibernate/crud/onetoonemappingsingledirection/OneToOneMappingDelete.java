package com.example.inversionofcontrol.hibernate.crud.onetoonemappingsingledirection;

import com.example.inversionofcontrol.hibernate.crud.createsessionobjectofhibernate.CreateSessionObjectOfHibernateInstructorDao;
import com.example.inversionofcontrol.hibernate.dao.InstructorDao;
import org.hibernate.Session;

public class OneToOneMappingDelete {

    public static void main(String[] args) {

        CreateSessionObjectOfHibernateInstructorDao createSessionObjectOfHibernateInstructorDao=new CreateSessionObjectOfHibernateInstructorDao();

        //Create Session
        Session session=createSessionObjectOfHibernateInstructorDao.createSession();

        try{
            //start transaction of session
            session.beginTransaction();

            //Get object and delete
            //Here we give hard coded id
            InstructorDao instructorDao=session.get(InstructorDao.class,1);
            System.out.println(instructorDao);

            //Delete by delete() method
            //Here we only delete record from instructor table but also deleted from instructor_detail table
            //because we are providing cascade
            //Here first we check that instructorDao is empty or not
            if(instructorDao!=null) {
                session.delete(instructorDao);
            }
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
