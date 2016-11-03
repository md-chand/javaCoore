package com.orgname.javacore.example;

import com.orgname.javacore.oops.Employee;

/**
 * @author MyPC
 *
 */
public class MethodWithPossibleAccess {
	
	private String name;
	private double salary;
	private long id;
	
	//Method which wont return anything
	public void init(String name, double salary, long id)
	{
		this.name = name;
		this.salary = salary;
		this.id = id;
	}
	
	//Method which returns double value
	public double getSalary(){
		//Businell logic
		return salary;
	}
	
	//method which return an Employee object which in user defined object
	public Employee getEmployee(int empId) {
		//Businell logic to get employee having empId
		return new Employee();
	}
	
	//Method which is static
	public final void staticMethodExample() {
		System.out.println("Inside static method");
	}
	
	//Method which is final
	public final void finalMethodExample() {
		// some business logic
	}
	
	//Method which is synchronized
	public synchronized double getSynchronisedSalary(){
		return salary;
	}
	
	//A method which is protected
	protected void protectedMethodExamplle() {
		//Business logic
	}
}
