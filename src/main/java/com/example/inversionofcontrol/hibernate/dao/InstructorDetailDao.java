package com.example.inversionofcontrol.hibernate.dao;

import javax.persistence.*;

//@Entity annotation defines that this class's objects are mapped with database fields and this class has one field as a primary key
//@Table annotation used define that this class is a table
//Also we can give name of table
@Entity(name="instructor_detail")
@Table(name="instructor_detail")
public class InstructorDetailDao {

    //@Id annotation use to povide primary key to field
    //@Column use to define that this field is mapped with database table's column
    //Also we can provide name of the column
    //@GeneratedValue used to generate autoIncreament or unique values
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="youtube_channel")
    private String youtubeChannel;
    @Column(name="hobby")
    private String hobby;

    //Create default constructor
    public InstructorDetailDao(){}

    //Constructor with all fields
    public InstructorDetailDao(String youtubeChannel, String hobby) {
        this.youtubeChannel = youtubeChannel;
        this.hobby = hobby;
    }

    public InstructorDetailDao(int id, String youtubeChannel, String hobby) {
        this.id = id;
        this.youtubeChannel = youtubeChannel;
        this.hobby = hobby;
    }

    //Getters and Setters of all fields
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getYoutubeChannel() {
        return youtubeChannel;
    }

    public void setYoutubeChannel(String youtubeChannel) {
        this.youtubeChannel = youtubeChannel;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "id="+this.id+" Youtube Channel="+this.youtubeChannel+" Hobby="+this.hobby;
    }
}
