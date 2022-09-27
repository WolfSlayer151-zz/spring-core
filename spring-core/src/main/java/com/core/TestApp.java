package com.core;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {
	public static void main(String args[])
	{
		AbstractApplicationContext con=new ClassPathXmlApplicationContext("config.xml");
		Employee emp=(Employee) con.getBean("e1");
		System.out.println(emp);
		con.registerShutdownHook();
	}

}
