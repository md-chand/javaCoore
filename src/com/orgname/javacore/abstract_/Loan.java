package com.orgname.javacore.abstract_;

public abstract class Loan {

	//Every sub class of this class can set its own value to below variable
	public Double loanAmount;
	
	public abstract double getRateOfInterest();
	
	public abstract int getMaximumPeriod();
	
	//concrete method, it has the same functionality across all sub classes
	public void greetingMessage() {
		System.out.println("Welcome to ICICI Bank loan service");
	}
	
}
