package com.orgname.javacore.example;

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
		return (amount * interestRate)/duration;
	}
	
	public final void finalMethodExample() {
		// some business logic
	}
	
	public synchronized double getsynchronisedLoanAmount(){
		return (amount * interestRate)/duration;
	}
	
}
