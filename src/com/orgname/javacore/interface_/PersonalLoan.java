package com.orgname.javacore.interface_;

public class PersonalLoan implements LoanInterface {

	private Double loanAmount;

	// Overriding default constructor and setting value in to instance variable
	public PersonalLoan(Double loanAmount) {
		this.loanAmount = loanAmount;
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
