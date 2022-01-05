package com.example.inversionofcontrol.spring.qualifier;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.FileSystemXmlApplicationContext;

@SpringBootApplication
public class DemoApplicationQualifier {

	public static void main(String[] args) {

		FileSystemXmlApplicationContext fileSystemXmlApplicationContext =
				new FileSystemXmlApplicationContext("src/main/java/applicationContextAutoWiring.xml");

		//Check Field Autowiring
		BaseInterfaceQualifier baseInterfaceQualifier2= fileSystemXmlApplicationContext.getBean("testBeanFieldQualifier", BaseInterfaceQualifier.class);

		System.out.println(baseInterfaceQualifier2.beanMethod());

		//Call method to check Field injection
		System.out.println(baseInterfaceQualifier2.testQualifierMethod());

		fileSystemXmlApplicationContext.close();
	}

}
