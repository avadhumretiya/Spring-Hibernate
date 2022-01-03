package com.example.inversionofcontrol.dependencyinjection;

public class TestBeanDI implements BaseInterfaceDI {

    //Declare private field for dependency
    //This will define by following constructor
    private DIService diService;

    //Create constructor for get dependency
    TestBeanDI(DIService diService1){
        //define object of DIService
        this.diService=diService1;
    }

    //Implement interface method
    public String beanMethod(){
        return "TestBean method called";
    }

    @Override
    public String testDIMethod() {

        //Dependency = Helper
        //So, here we provided helper
        return diService.testDIMethod();
    }

}
