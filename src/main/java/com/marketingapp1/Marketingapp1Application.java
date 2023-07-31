package com.marketingapp1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.marketingapp1.util.EmailServiceImpl;


//application
@SpringBootApplication
public class Marketingapp1Application {

	public static void main(String[] args) {
		SpringApplication.run(Marketingapp1Application.class, args);
	}
	
	/*
	 * @Bean public EmailServiceImpl emailServiceImpl() { return new
	 * EmailServiceImpl(); }
	 */

}
