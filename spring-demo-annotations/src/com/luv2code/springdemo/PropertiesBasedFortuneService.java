package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PropertiesBasedFortuneService implements FortuneService {

	@Value("${first.fortune}")
	private String firstFortune;

	@Value("${second.fortune}")
	private String secondFortune;

	@Value("${third.fortune}")
	private String thirdFortune;

	private String[] fortuneArray = { firstFortune, secondFortune, thirdFortune };

	private Random r = new Random();

	@Override
	public String getFortune() {

		return fortuneArray[this.r.nextInt(fortuneArray.length)];
	}

}
