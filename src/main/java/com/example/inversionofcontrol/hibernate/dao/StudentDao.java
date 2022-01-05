package com.example.inversionofcontrol.hibernate.dao;

import javax.persistence.*;

//@Entity annotation defines that this class's objects are mapped with database fields and this class has one field as a primary key
//@Table annotation used define that this class is a table
//Also we can give name of table
@Entity(name="student_details")
@Table(name="student_details")
public class StudentDao {

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

    //Create default constructor
    public  StudentDao(){}

    //Constructor with all fields
    public StudentDao(int id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public StudentDao(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

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

    @Override
    public String toString() {
        return "id="+this.id+"First name="+this.firstName+"Last name="+this.lastName+"email="+this.email;
    }
}
