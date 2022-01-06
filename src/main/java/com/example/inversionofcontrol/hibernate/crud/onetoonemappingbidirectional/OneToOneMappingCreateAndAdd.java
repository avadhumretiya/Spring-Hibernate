package com.example.inversionofcontrol.hibernate.crud.onetoonemappingbidirectional;

import com.example.inversionofcontrol.hibernate.crud.createsessionobjectofhibernate.CreateSessionObjectOfHibernateInstructorDao;
import com.example.inversionofcontrol.hibernate.crud.createsessionobjectofhibernate.CreateSessionObjectOfHibernateInstructorDaoBiDirectional;
import com.example.inversionofcontrol.hibernate.dao.InstructorDao;
import com.example.inversionofcontrol.hibernate.dao.InstructorDaoBiDirectional;
import com.example.inversionofcontrol.hibernate.dao.InstructorDetailDao;
import com.example.inversionofcontrol.hibernate.dao.InstructorDetailDaoBiDirectional;
import org.hibernate.Session;

public class OneToOneMappingCreateAndAdd {

    public static void main(String[] args) {

        CreateSessionObjectOfHibernateInstructorDaoBiDirectional createSessionObjectOfHibernateInstructorDaoBiDirectional
                = new CreateSessionObjectOfHibernateInstructorDaoBiDirectional();

        //Create Session
        Session session=createSessionObjectOfHibernateInstructorDaoBiDirectional.createSession();

        try{
            //Create a dao object with constructor to set values of fields
            //Or we can use setters to set values of fields
            InstructorDaoBiDirectional instructorDaoBiDirectional=new InstructorDaoBiDirectional("avadh","umretiya","avadh@7span.com");
            InstructorDetailDaoBiDirectional instructorDetailDaoBiDirectional=new InstructorDetailDaoBiDirectional("www.youtube.com","travelling");

            //associate objects
            //Here we are performing in reverse manner
            instructorDetailDaoBiDirectional.setInstructorDaoBiDirectional(instructorDaoBiDirectional);

            //start transaction of session
            session.beginTransaction();

            //Save object or insert into table
            //Here only we are saving instructor object but automatically instructorDetail object save
            //Because we are providing cascading
            session.save(instructorDetailDaoBiDirectional);

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
