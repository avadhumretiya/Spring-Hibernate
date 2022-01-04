package com.example.inversionofcontrol.annotations;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.FileSystemXmlApplicationContext;

@SpringBootApplication
public class DemoApplicationAnnotations {

	public static void main(String[] args) {

		//Load the spring configuration file
		FileSystemXmlApplicationContext fileSystemXmlApplicationContext =
				new FileSystemXmlApplicationContext("/src/main/java/applicationContextAnnotations.xml");

		//Retrieve bean from own spring container
		//Here we get bean
		AnnotationsInterface annotationsInterface= fileSystemXmlApplicationContext.getBean("myBean", AnnotationsInterface.class);

		//Call method by interface object
		System.out.println(annotationsInterface.beanMethod());

		fileSystemXmlApplicationContext.close();
	}

}
