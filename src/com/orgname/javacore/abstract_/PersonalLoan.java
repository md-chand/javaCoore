package com.orgname.javacore.abstract_;

public class PersonalLoan extends Loan {

	//Overriding default constructor and setting value to super class variable
	public PersonalLoan(Double loanAmount) {
		super.loanAmount = loanAmount;
	}

	@Override
	public double getRateOfInterest() {
		return 14;
	}

	@Override
	public int getMaximumPeriod() {
		int maxPeriod = 0;
		if (loanAmount < 50000) {
			maxPeriod = 1;
		} else if (loanAmount > 50000 && loanAmount < 100000) {
			maxPeriod = 3;
		} else {
			maxPeriod = 5;
		}
		return maxPeriod;
	}

}
