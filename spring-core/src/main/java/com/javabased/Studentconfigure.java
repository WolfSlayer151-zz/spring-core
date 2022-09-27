package com.javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Studentconfigure {
	
	@Bean
	public Student helloStudent()
	{
		return new Student();
	}

}
