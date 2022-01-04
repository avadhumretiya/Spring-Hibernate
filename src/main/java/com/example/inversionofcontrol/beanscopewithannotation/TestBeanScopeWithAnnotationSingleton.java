package com.example.inversionofcontrol.beanscopewithannotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class TestBeanScopeWithAnnotationSingleton implements BeanScopeWithAnnotationInterface {

    //Implement interface method
    public String beanMethod(){
        return "TestBean method called";
    }
}
