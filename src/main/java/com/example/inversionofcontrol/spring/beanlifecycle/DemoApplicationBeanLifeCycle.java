package com.example.inversionofcontrol.spring.beanlifecycle;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.FileSystemXmlApplicationContext;

@SpringBootApplication
public class DemoApplicationBeanLifeCycle {

	public static void main(String[] args) {

		//Load the spring configuration file
		FileSystemXmlApplicationContext fileSystemXmlApplicationContext =
				new FileSystemXmlApplicationContext("/src/main/java/applicationContextBeanLifeCycle.xml");

		//Retrieve bean from own spring container
		//Here we get bean
		BeanLifeCycleInterface beanLifeCycleInterface= fileSystemXmlApplicationContext.getBean("myBean", BeanLifeCycleInterface.class);

		fileSystemXmlApplicationContext.close();
	}

}
