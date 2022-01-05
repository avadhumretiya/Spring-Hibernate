package com.example.inversionofcontrol.spring.autowiring;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.FileSystemXmlApplicationContext;

@SpringBootApplication
public class DemoApplicationAutowiring {

	public static void main(String[] args) {

		FileSystemXmlApplicationContext fileSystemXmlApplicationContext =
				new FileSystemXmlApplicationContext("src/main/java/applicationContextAutoWiring.xml");

		//Check Constructor Autowiring
		BaseInterfaceAutowiring baseInterface= fileSystemXmlApplicationContext.getBean("testBeanConstructorAutowiring", BaseInterfaceAutowiring.class);

		//Check Setter Autowiring
		BaseInterfaceAutowiring baseInterface1= fileSystemXmlApplicationContext.getBean("testBeanSetterAutowiring", BaseInterfaceAutowiring.class);

		//Check Field Autowiring
		BaseInterfaceAutowiring baseInterface2= fileSystemXmlApplicationContext.getBean("testBeanFieldAutowiring", BaseInterfaceAutowiring.class);

		System.out.println(baseInterface.beanMethod());
		System.out.println(baseInterface1.beanMethod());
		System.out.println(baseInterface2.beanMethod());

		//Call method to check constructor injection
		System.out.println(baseInterface.testAutowiringMethod());
		//Call method to check Setter or Method injection
		System.out.println(baseInterface1.testAutowiringMethod());
		//Call method to check Field injection
		System.out.println(baseInterface2.testAutowiringMethod());

		fileSystemXmlApplicationContext.close();
	}

}
