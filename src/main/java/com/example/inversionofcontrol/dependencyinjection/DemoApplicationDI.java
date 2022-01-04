package com.example.inversionofcontrol.dependencyinjection;

import com.example.inversionofcontrol.ioc.BaseInterfaceIoC;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.FileSystemXmlApplicationContext;

@SpringBootApplication
public class DemoApplicationDI {

	//Dependency Injection (DI)
	//This used to inject supporting or helping object
	//There are several types of dependency injections
	//like Constructor Injection, Method Injection, Parameter Injection,
	public static void main(String[] args) {

		//Load the spring configuration file
		//Which is created manually
		//Basically, we are creating a spring container manually
		//Here we need to use ClassPathXmlApplicationContext instead of FileSystemXmlApplicationContext but that doesn't work
		//still I have no solution for this
		FileSystemXmlApplicationContext fileSystemXmlApplicationContext =
				new FileSystemXmlApplicationContext("src/main/java/applicationContext.xml");

		//Retrieve bean from own spring container
		//Here we get bean
		BaseInterfaceDI baseInterface= fileSystemXmlApplicationContext.getBean("myBeanDI", BaseInterfaceDI.class);
		//Call methods on the bean
		System.out.println(baseInterface.beanMethod());

		//Call method to check constructor injection
		System.out.println(baseInterface.testDIMethod());

		//close the context
		//for cleanup or garbage collection
		fileSystemXmlApplicationContext.close();
	}

}
