package com.example.inversionofcontrol.spring.configbyjavacode;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.example.inversionofcontrol.configbyjavacode")
@PropertySource("classpath:custom.properties")
public class ConfigByJavaCodeClass {


    public TestInterfaceByJavaCode checkService(){
        return new ByJavaCodeService();
    }

    @Bean
    public TestBeanLifeCycleWithJavaCode giveReference(){
        return new TestBeanLifeCycleWithJavaCode(checkService());
    }
}
