package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
//@ComponentScan("com.luv2code.springdemo")
public class SportConfig {

	// define bean for sad fortune service
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}

	// define bean for swim coach and inject dependency with bean's name
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
}
