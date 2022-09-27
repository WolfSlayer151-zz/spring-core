package com.javabased;

public class Student {
	private String message;

	@Override
	public String toString() {
		return "Student [message=" + message + "]";
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Student(String message) {
		super();
		this.message = message;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

}
