package com.example.inversionofcontrol.spring.ioc;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.FileSystemXmlApplicationContext;

@SpringBootApplication
public class DemoApplicationIoC {

	//IoC (Inversion Of Control) Container means Spring Container
	//It create and manage and assemble objects and handle life cycles of an objects
	//There are two types of containers//BeanFactoryContainer and ApplicationContextContainer
	//Dependency Injection take an information from code, annotations, POJO, XML file and control them
	//Which are called beans
	//And this whole process called IoC
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
		BaseInterfaceIoC baseInterface= fileSystemXmlApplicationContext.getBean("myBean", BaseInterfaceIoC.class);
		BaseInterfaceIoC baseInterface1=fileSystemXmlApplicationContext.getBean("myBean1", BaseInterfaceIoC.class);

		//Call methods on the bean
		System.out.println(baseInterface.beanMethod());
		System.out.println(baseInterface1.beanMethod());

		//close the context
		//for cleanup or garbage collection
		fileSystemXmlApplicationContext.close();
	}

}
