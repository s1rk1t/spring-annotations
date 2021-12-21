package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {

		// read Spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		// get the bean from the Spring container using default bean id
		Coach tennisCoach = context.getBean("tennisCoach", Coach.class);

		// call methods on bean
		System.out.println(tennisCoach.getDailyWorkout());

		// call method to get fortune from autowired dependency
		System.out.println(tennisCoach.getDailyFortune());

		// close the container
		context.close();

	}

}
