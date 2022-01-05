package com.example.inversionofcontrol.spring.annotations;

import org.springframework.stereotype.Component;

//Here we use Component annotation Which add beans into spring container
//Also we provide bean name in Component Annotation argument
//If we do not provide bean name then it will automatically take bean name as class name
//Just do one change first letter in lower case of class name//Here TestAnnotations -> testAnnotations
//Remove comment to check
//@Component("testAnnotations")
@Component("myBean")
public class TestAnnotations implements AnnotationsInterface {

    //Implement interface method
    public String beanMethod(){
        return "TestBean method called";
    }


}
