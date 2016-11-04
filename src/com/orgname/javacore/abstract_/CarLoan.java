package com.orgname.javacore.abstract_;

public class CarLoan extends Loan {

	//Overriding default constructor and setting value to super class variable
	public CarLoan(Double loanAmount) {
		super.loanAmount = loanAmount;
	}

	@Override
	public double getRateOfInterest() {
		return 10.75;
	}

	@Override
	public int getMaximumPeriod() {
		int maxPeriod = 0;
		if (loanAmount < 400000) {
			maxPeriod = 3;
		} else if (loanAmount > 400000 && loanAmount < 1000000) {
			maxPeriod = 3;
		} else {
			maxPeriod = 5;
		}
		return maxPeriod;
	}

	//Overriding an existing method of super class
	@Override
	public void greetingMessage() {
		System.out.println("Welcome to ICICI Bank Car Loan service");
	}	

}
