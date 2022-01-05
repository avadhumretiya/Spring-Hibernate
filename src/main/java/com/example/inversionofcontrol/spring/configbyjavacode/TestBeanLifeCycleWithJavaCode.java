package com.example.inversionofcontrol.spring.configbyjavacode;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TestBeanLifeCycleWithJavaCode implements BeanLifeCycleWithJavaCodeInterface {

    private TestInterfaceByJavaCode testInterfaceByJavaCode;

    @Value("${abc.email}")
    private String email;

    @Value("${abc.password}")
    private String password;

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

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
