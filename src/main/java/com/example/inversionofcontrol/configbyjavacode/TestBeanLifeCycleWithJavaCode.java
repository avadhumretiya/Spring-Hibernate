package com.example.inversionofcontrol.configbyjavacode;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TestBeanLifeCycleWithJavaCode implements BeanLifeCycleWithJavaCodeInterface {

    private TestInterfaceByJavaCode testInterfaceByJavaCode;

    TestBeanLifeCycleWithJavaCode(TestInterfaceByJavaCode testInterfaceByJavaCode1){
        testInterfaceByJavaCode=testInterfaceByJavaCode1;
    }
    //Implement interface method
    public String beanMethod(){
        return "TestBean method called";
    }

    @Override
    public String testByJavaCode() {
        return testInterfaceByJavaCode.testByJavaCode();
    }

}
