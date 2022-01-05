package com.example.inversionofcontrol.spring.beanlifecyclewithannotation;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TestBeanLifeCycleWithAnnotation implements BeanLifeCycleWithAnnotationInterface {

    //Implement interface method
    public String beanMethod(){
        return "TestBean method called";
    }

    //It will consider as init() method of bean
    @PostConstruct
    public void beanInitMethod(){System.out.println("bean initialize");}

    //It will consider as destroy() method of bean
    @PreDestroy
    public void beanDestroyMethod(){System.out.println("bean destroy");}
}
