package com.example.BS4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class Bs4Application {

	public static void main(String[] args) {

		SpringApplication.run(Bs4Application.class, args);


	}

	@Autowired
	private Perfiles perfiles;

	@Autowired
	private Properties properties;

	@PostConstruct
	private void init(){
		System.out.println(properties);
	}
}
