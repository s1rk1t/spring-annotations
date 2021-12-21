package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {

		// read Spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		// get the bean from the Spring container using default bean id
		SwimCoach swimCoach = context.getBean("swimCoach", SwimCoach.class);

		// call methods on bean
		System.out.println(swimCoach.getDailyWorkout());

		// call method to get fortune from autowired dependency
		System.out.println(swimCoach.getDailyFortune());

		// call getter methods as defined in SwimCoach class
		System.out.println("email: " + swimCoach.getEmail());

		System.out.println("team: " + swimCoach.getTeam());

		// close the container
		context.close();

	}

}
