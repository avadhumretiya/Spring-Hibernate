package com.example.inversionofcontrol.beanscopewithannotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TestBeanScopeWithAnnotationPrototype implements BeanScopeWithAnnotationInterface {

    //Implement interface method
    public String beanMethod(){
        return "TestBean method called";
    }
}
