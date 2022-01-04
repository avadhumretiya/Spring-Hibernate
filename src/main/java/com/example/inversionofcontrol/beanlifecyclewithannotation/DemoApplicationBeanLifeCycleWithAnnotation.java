package com.example.inversionofcontrol.beanlifecyclewithannotation;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.FileSystemXmlApplicationContext;

@SpringBootApplication
public class DemoApplicationBeanLifeCycleWithAnnotation {

	public static void main(String[] args) {

		//Load the spring configuration file
		FileSystemXmlApplicationContext fileSystemXmlApplicationContext =
				new FileSystemXmlApplicationContext("/src/main/java/applicationContextAutoWiring.xml");

		//Retrieve bean from own spring container
		//Here we get bean
		BeanLifeCycleWithAnnotationInterface beanLifeCycleWithAnnotationInterface= fileSystemXmlApplicationContext.getBean("testBeanLifeCycleWithAnnotation", BeanLifeCycleWithAnnotationInterface.class);

		fileSystemXmlApplicationContext.close();
	}

}
