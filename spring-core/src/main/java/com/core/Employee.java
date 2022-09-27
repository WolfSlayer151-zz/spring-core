package com.core;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	private int id;
	private String empName;
	@Autowired
	private Address address;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String empName, Address address) {
		super();
		this.id = id;
		this.empName = empName;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", address=" + address + "]";
	}
	public void Hey()
	{
		System.out.println("Hey");
	}
	public void Bye()
	{
		System.out.println("Bye");
	}

}
