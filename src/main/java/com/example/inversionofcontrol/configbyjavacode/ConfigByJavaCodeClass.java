package com.example.inversionofcontrol.configbyjavacode;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.inversionofcontrol.configbyjavacode")
public class ConfigByJavaCodeClass {

    @Bean
    public TestInterfaceByJavaCode checkService(){
        return new ByJavaCodeService();
    }

    @Bean
    public TestBeanLifeCycleWithJavaCode giveReference(){
        return new TestBeanLifeCycleWithJavaCode(checkService());
    }
}
