package com.example.inversionofcontrol.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TestBeanConstructorAutowiring implements BaseInterfaceAutowiring {

    private TestInterfaceAutowiring testInterfaceAutowiring;

    //Inject Constructor Dependency
    @Autowired
    TestBeanConstructorAutowiring(TestInterfaceAutowiring testInterfaceAutowiring1){
        System.out.println("Inside Constructor");
        testInterfaceAutowiring=testInterfaceAutowiring1;
    }

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
