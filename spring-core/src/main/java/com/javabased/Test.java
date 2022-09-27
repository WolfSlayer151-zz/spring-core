package com.javabased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main (String args[])
	{
		ApplicationContext con=new AnnotationConfigApplicationContext(Studentconfigure.class);
		Student st=con.getBean(Student.class);
		st.setMessage("Hello World");
		st.getMessage();
		System.out.println(st);
	}

}
