package com.orgname.javacore.example;

import com.orgname.javacore.oops.Employee;

/**
 * @author MyPC
 *
 */
public class MethodWithPossibleAccess {
	
	private String name;
	private double interestRate;
	private long duration;
	private double amount;
	
	//Method which wont return anything
	public void init(String name, Long empId, double amount)
	{
		this.amount = amount;
		this.duration = duration;
		this.interestRate = interestRate;
	}
	
	//Method which returns double value
	public double getLoanAmount(){
		//Businell logic
		return (amount * interestRate)/duration;
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
	public synchronized double getsynchronisedLoanAmount(){
		return (amount * interestRate)/duration;
	}
	
	//A method which is protected
	protected void protectedMethodExamplle() {
		//Business logic
	}
}
