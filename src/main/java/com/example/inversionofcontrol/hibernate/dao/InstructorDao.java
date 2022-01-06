package com.example.inversionofcontrol.hibernate.dao;

import javax.persistence.*;

//@Entity annotation defines that this class's objects are mapped with database fields and this class has one field as a primary key
//@Table annotation used define that this class is a table
//Also we can give name of table
@Entity(name="instructor")
@Table(name="instructor")
public class InstructorDao {

    //@Id annotation use to povide primary key to field
    //@Column use to define that this field is mapped with database table's column
    //Also we can provide name of the column
    //@GeneratedValue used to generate autoIncreament or unique values
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    @Column(name="email")
    private String email;

    //One to one mapping
    //Here we apply CascadeType.All which cascade all the operations performed on this table to joined table
    //@JoinColumn to join two columns
    //Here we join instructor_detail_id with id of instructor_detail table
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "instructor_detail_id")
    private InstructorDetailDao instructorDetailDao;

    //Create default constructor
    public InstructorDao(){}

    public InstructorDao(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public InstructorDao(int id, String firstName, String lastName, String email, InstructorDetailDao instructorDetailDao) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.instructorDetailDao = instructorDetailDao;
    }

    //Constructor with all fields

    //Getters and Setters of all fields
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public InstructorDetailDao getInstructorDetailDao() {
        return instructorDetailDao;
    }

    public void setInstructorDetailDao(InstructorDetailDao instructorDetailDao) {
        this.instructorDetailDao = instructorDetailDao;
    }

    @Override
    public String toString() {
        return "id="+this.id+"First name="+this.firstName+"Last name="+this.lastName+"email="+this.email;
    }
}
