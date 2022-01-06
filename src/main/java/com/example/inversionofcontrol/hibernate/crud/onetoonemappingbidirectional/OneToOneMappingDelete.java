package com.example.inversionofcontrol.hibernate.crud.onetoonemappingbidirectional;

import com.example.inversionofcontrol.hibernate.crud.createsessionobjectofhibernate.CreateSessionObjectOfHibernateInstructorDao;
import com.example.inversionofcontrol.hibernate.crud.createsessionobjectofhibernate.CreateSessionObjectOfHibernateInstructorDaoBiDirectional;
import com.example.inversionofcontrol.hibernate.dao.InstructorDao;
import com.example.inversionofcontrol.hibernate.dao.InstructorDetailDaoBiDirectional;
import org.hibernate.Session;

public class OneToOneMappingDelete {

    public static void main(String[] args) {

        CreateSessionObjectOfHibernateInstructorDaoBiDirectional createSessionObjectOfHibernateInstructorDaoBiDirectional
                =new CreateSessionObjectOfHibernateInstructorDaoBiDirectional();

        //Create Session
        Session session=createSessionObjectOfHibernateInstructorDaoBiDirectional.createSession();

        try{
            //start transaction of session
            session.beginTransaction();

            //Get object and delete
            //Here we give hard coded id
            InstructorDetailDaoBiDirectional instructorDetailDaoBiDirectional=session.get(InstructorDetailDaoBiDirectional.class,2);
            System.out.println(instructorDetailDaoBiDirectional);

            //Delete by delete() method
            //Here we only delete record from instructor table but also deleted from instructor_detail table
            //because we are providing cascade
            //Here first we check that instructorDao is empty or not
            //Reverse of above process
            if(instructorDetailDaoBiDirectional!=null) {
                session.delete(instructorDetailDaoBiDirectional);
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
