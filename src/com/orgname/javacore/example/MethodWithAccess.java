package com.orgname.javacore.example;

import com.orgname.javacore.oops.Employee;

/**
 * @author MyPC
 *
 */
public class MethodWithAccess {
	
	private String name;
	private double interestRate;
	private long duration;
	private double amount;
	
	public void init(String name, Long empId, double amount)
	{
		this.amount = amount;
		this.duration = duration;
		this.interestRate = interestRate;
	}
	
	public double getLoanAmount(){
		//Businell logic
		return (amount * interestRate)/duration;
	}
	
	public Employee getEmployee(int empId) {
		//Businell logic to get employee having empId
		return new Employee();
	}
	
	public final void finalMethodExample() {
		// some business logic
	}
	
	public synchronized double getsynchronisedLoanAmount(){
		return (amount * interestRate)/duration;
	}	
}
