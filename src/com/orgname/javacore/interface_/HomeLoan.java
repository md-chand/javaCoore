package com.orgname.javacore.interface_;

public class HomeLoan implements LoanInterface {

	private Double loanAmount;

	// Overriding default constructor and setting value in to instance variable
	public HomeLoan(Double loanAmount) {
		this.loanAmount = loanAmount;
	}

	@Override
	public double getRateOfInterest() {
		return 9.5;
	}

	@Override
	public int getMaximumPeriod() {
		int maxPeriod = 0;
		if (loanAmount < 1000000) {
			maxPeriod = 10;
		} else if (loanAmount > 1000000 && loanAmount < 2000000) {
			maxPeriod = 15;
		} else {
			maxPeriod = 20;
		}
		return maxPeriod;
	}

}
