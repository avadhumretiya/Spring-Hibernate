package com.example.inversionofcontrol.hibernate.basic;

import java.sql.Connection;
import java.sql.DriverManager;

public class BasicJDBCCheck {

    public static void main(String[] args) {

        String jdbcURL="jdbc:mysql://localhost:3306/student?useSSL=false";
        String user="root";
        String password="new-strong-password";

        try{
            Connection connection= DriverManager.getConnection(jdbcURL,user,password);
            System.out.println("Connected with database");
        }catch (Exception exception){
            exception.printStackTrace();
        }
    }
}
