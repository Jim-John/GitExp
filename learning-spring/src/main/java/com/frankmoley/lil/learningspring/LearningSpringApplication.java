package com.frankmoley.lil.learningspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearningSpringApplication {
    private String firstName;
	public static void main(String[] args) {
		SpringApplication.run(LearningSpringApplication.class, args);
		LearningSpringApplication learningSpringApplication=new  LearningSpringApplication();
		learningSpringApplication.testBranchoneChange();
	}

	void test_mainBranchChange ()
	{

	}

	void test2()
	{

	}


}
