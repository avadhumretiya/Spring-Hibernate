package com.example.inversionofcontrol.spring.configbyjavacode;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoApplicationConfigByJavaCode {

	public static void main(String[] args) {

		//Load the spring configuration file
		//Here we pass our own created configuration class
		AnnotationConfigApplicationContext annotationConfigApplicationContext =
				new AnnotationConfigApplicationContext(ConfigByJavaCodeClass.class);

		//Retrieve bean from own spring container
		//Here we get bean
		TestBeanLifeCycleWithJavaCode testBeanLifeCycleWithJavaCode= annotationConfigApplicationContext.getBean("testBeanLifeCycleWithJavaCode", TestBeanLifeCycleWithJavaCode.class);

		//Call method by interface object
		System.out.println(testBeanLifeCycleWithJavaCode.beanMethod());

		System.out.println(testBeanLifeCycleWithJavaCode.testByJavaCode());

		System.out.println(testBeanLifeCycleWithJavaCode.getEmail());
		System.out.println(testBeanLifeCycleWithJavaCode.getPassword());
		annotationConfigApplicationContext.close();
	}

}
