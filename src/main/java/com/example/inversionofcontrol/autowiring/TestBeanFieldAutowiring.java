package com.example.inversionofcontrol.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TestBeanFieldAutowiring implements BaseInterfaceAutowiring {

    //Field injection
    //No need to write any constructor dependency injection or method depenedency injection
    //We can directly autowire the field to assign an object
    //Which happens behind by reflection concept
    @Autowired
    private TestInterfaceAutowiring testInterfaceAutowiring;

    //Implement interface method
    public String beanMethod(){
        return "TestBean method called";
    }

    @Override
    public String testAutowiringMethod() {

        //Dependency = Helper
        //So, here we provided helper
        return testInterfaceAutowiring.testAutowiringMethod();
    }

}
