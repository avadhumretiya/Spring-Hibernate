package com.example.inversionofcontrol.spring.beanscopewithannotation;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.FileSystemXmlApplicationContext;

@SpringBootApplication
public class DemoApplicationBeanScopeWithAnnotation {

	public static void main(String[] args) {

		//Load the spring configuration file
		FileSystemXmlApplicationContext fileSystemXmlApplicationContext =
				new FileSystemXmlApplicationContext("/src/main/java/applicationContextAutoWiring.xml");

		//Retrieve bean from own spring container
		//Here we get bean
//		BeanScopeWithAnnotationInterface baseInterfacePrototype= fileSystemXmlApplicationContext.getBean("myBean", BeanScopeWithAnnotationInterface.class);
//		BeanScopeWithAnnotationInterface baseInterfacePrototype1=fileSystemXmlApplicationContext.getBean("myBean", BeanScopeWithAnnotationInterface.class);
//
		BeanScopeWithAnnotationInterface baseInterfaceSingeton= fileSystemXmlApplicationContext.getBean("testBeanScopeWithAnnotationSingleton", BeanScopeWithAnnotationInterface.class);
		BeanScopeWithAnnotationInterface baseInterfaceSingeton1=fileSystemXmlApplicationContext.getBean("testBeanScopeWithAnnotationSingleton", BeanScopeWithAnnotationInterface.class);

		BeanScopeWithAnnotationInterface baseInterfacePrototype= fileSystemXmlApplicationContext.getBean("testBeanScopeWithAnnotationPrototype", BeanScopeWithAnnotationInterface.class);
		BeanScopeWithAnnotationInterface baseInterfacePrototype1=fileSystemXmlApplicationContext.getBean("testBeanScopeWithAnnotationPrototype", BeanScopeWithAnnotationInterface.class);

		//Singleton
		System.out.println(baseInterfaceSingeton);
		System.out.println(baseInterfaceSingeton1);
		System.out.println(baseInterfaceSingeton==baseInterfaceSingeton1);

		//Prototype
		System.out.println(baseInterfacePrototype);
		System.out.println(baseInterfacePrototype1);
		System.out.println(baseInterfacePrototype==baseInterfacePrototype1);
	}

}
