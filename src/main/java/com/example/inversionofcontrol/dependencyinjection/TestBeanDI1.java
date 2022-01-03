package com.example.inversionofcontrol.dependencyinjection;

public class TestBeanDI1 implements BaseInterfaceDI {

    //Implement interface method
    public String beanMethod(){
        return "TestBean1 method called";
    }

    @Override
    public String testDIMethod() {
        return "TestBeanDI1 method called";
    }
}
