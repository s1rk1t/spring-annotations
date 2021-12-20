package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String fortune1 = "Today will be randomly great!";
	private String fortune2 = "Today will be randomly excellent!";
	private String fortune3 = "Today will be randomly  fantastic!";

	private String[] fortunes = new String[] { fortune1, fortune2, fortune3 };

	private Random r = new Random();

	@Override
	public String getFortune() {

		// return random fortune from fortunes array

		return fortunes[this.r.nextInt(fortunes.length)];
	}

}