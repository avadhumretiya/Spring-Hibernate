package com.example.inversionofcontrol.configbyjavacode;

import com.example.inversionofcontrol.beanlifecyclewithannotation.BeanLifeCycleWithAnnotationInterface;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

@SpringBootApplication
public class DemoApplicationConfigByJavaCode {

	public static void main(String[] args) {

		//Load the spring configuration file
		//Here we pass our own created configuration class
		AnnotationConfigApplicationContext annotationConfigApplicationContext =
				new AnnotationConfigApplicationContext(ConfigByJavaCodeClass.class);

		//Retrieve bean from own spring container
		//Here we get bean
		BeanLifeCycleWithJavaCodeInterface beanLifeCycleWithAnnotationInterface= annotationConfigApplicationContext.getBean("testBeanLifeCycleWithJavaCode", BeanLifeCycleWithJavaCodeInterface.class);

		//Call method by interface object
		System.out.println(beanLifeCycleWithAnnotationInterface.beanMethod());

		System.out.println(beanLifeCycleWithAnnotationInterface.testByJavaCode());
		annotationConfigApplicationContext.close();
	}

}
