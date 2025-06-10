package com.anshul.beans;

public class Employee {
 private String name;
 private int salary;
 private String cname;
 
 
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Employee [name=" + name + ", salary=" + salary + ", cname=" + cname + "]";
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
 
 
}
