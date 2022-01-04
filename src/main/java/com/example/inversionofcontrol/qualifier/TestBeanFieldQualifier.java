package com.example.inversionofcontrol.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TestBeanFieldQualifier implements BaseInterfaceQualifier {

    //Field injection
    //No need to write any constructor dependency injection or method depenedency injection
    //We can directly autowire the field to assign an object
    //Which happens behind by reflection concept
    @Autowired
    //Here we are defining Qualifier annotation to consider which implementation we want to use
    @Qualifier("qualifierService1")
    private TestInterfaceQualifier testInterfaceQualifier;

    //Implement interface method
    public String beanMethod(){
        return "TestBean method called";
    }

    @Override
    public String testQualifierMethod() {

        //Dependency = Helper
        //So, here we provided helper
        return testInterfaceQualifier.testQualifierMethod();
    }

}
