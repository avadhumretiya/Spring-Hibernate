package com.example.inversionofcontrol.autowiring;

import com.example.inversionofcontrol.qualifier.TestInterfaceQualifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestBeanSetterAutowiring implements BaseInterfaceAutowiring {

    private TestInterfaceAutowiring testInterfaceAutowiring;

    //Inject Setter Dependency
    @Autowired
    public void setAutowiringService(TestInterfaceAutowiring testInterfaceAutowiring1){
        System.out.println("Inside Setter Method");
        this.testInterfaceAutowiring=testInterfaceAutowiring1;
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
