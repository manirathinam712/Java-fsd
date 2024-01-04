package com.FeedBack.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com")
@EntityScan(basePackages = "com.FeedBack.entity")
@EnableJpaRepositories(basePackages = "com.FeedBack.repository")
public class FeedbackMain{
	public static void main(String[] args) {
	
	SpringApplication.run(FeedbackMain.class, args);
	System.out.println("Spring boot up!");
}

}
