package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class HttpsSslExample1Application {

	public static void main(String[] args) {
		//SpringApplication.run(HttpsSslExample1Application.class, args);
		
		SpringApplication application = new SpringApplication(HttpsSslExample1Application.class);
        application.setAdditionalProfiles("ssl");
        application.run(args);
	}

}
