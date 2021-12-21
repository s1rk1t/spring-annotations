package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BilliardsJavaConfigDemoApp {

	public static void main(String[] args) {

		// read Spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BilliardsConfig.class);

		// get the bean from the Spring container using default bean id
		Coach billiardsCoach = context.getBean("billiardsCoach", Coach.class);

		// call methods on bean
		System.out.println(billiardsCoach.getDailyWorkout());

		// call method to get fortune from autowired dependency
		System.out.println(billiardsCoach.getDailyFortune());

		// close the container
		context.close();

	}

}
