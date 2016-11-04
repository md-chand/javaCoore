package com.orgname.javacore.interface_;

public class CarLoan implements LoanInterface {

	private Double loanAmount;
	
	// Overriding default constructor and setting value in to instance variable
		public CarLoan(Double loanAmount) {
			this.loanAmount = loanAmount;
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

		//This method to demonstrate that a sub class can have its own methods along with super class methods :)
		public void greetingMessage() {
			System.out.println("Welcome to ICICI Bank Car Loan service");
		}

}
