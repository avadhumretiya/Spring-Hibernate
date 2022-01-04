package com.example.inversionofcontrol.beanscope;

import com.example.inversionofcontrol.ioc.BaseInterfaceIoC;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.FileSystemXmlApplicationContext;

@SpringBootApplication
public class DemoApplicationBeanScope {

	public static void main(String[] args) {

		//Load the spring configuration file
		FileSystemXmlApplicationContext fileSystemXmlApplicationContext =
				new FileSystemXmlApplicationContext("/src/main/java/applicationContextBeanScope.xml");

		//Retrieve bean from own spring container
		//Here we get bean
		BeanScopeInterface baseInterfacePrototype= fileSystemXmlApplicationContext.getBean("myBean", BeanScopeInterface.class);
		BeanScopeInterface baseInterfacePrototype1=fileSystemXmlApplicationContext.getBean("myBean", BeanScopeInterface.class);

		BeanScopeInterface baseInterfaceSingeton= fileSystemXmlApplicationContext.getBean("myBean1", BeanScopeInterface.class);
		BeanScopeInterface baseInterfaceSingeton1=fileSystemXmlApplicationContext.getBean("myBean1", BeanScopeInterface.class);

		//Check bean scope
		//By default scope of bean is singleton
		//Singleton means sharing //This provide same reference to all the objects
		//There are several other types of scope
		//Like Prototype, request, session, global-session
		//Prototype means every object get different or individual reference not shared
		//Here we check both singleton and prototype scopes
		System.out.println(baseInterfacePrototype);
		System.out.println(baseInterfacePrototype1);
		System.out.println(baseInterfacePrototype==baseInterfacePrototype1);
		System.out.println(baseInterfaceSingeton);
		System.out.println(baseInterfaceSingeton1);
		System.out.println(baseInterfaceSingeton==baseInterfaceSingeton1);
	}

}
