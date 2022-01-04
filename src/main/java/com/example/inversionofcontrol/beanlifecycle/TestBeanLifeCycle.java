package com.example.inversionofcontrol.beanlifecycle;

public class TestBeanLifeCycle implements BeanLifeCycleInterface {

    //Implement interface method
    public String beanMethod(){
        return "TestBean method called";
    }

    public void beanInitMethod(){System.out.println("bean initialize");}
    public void beanDestroyMethod(){System.out.println("bean destroy");}
}
