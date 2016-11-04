package com.orgname.javacore.abstract_;

import java.util.Scanner;

public class TestAbstract {

	public static void main(String[] args) {
		
		System.out.println("Program demonstrate abstract class implementation");
		System.out.println("===================================================");
		// Create a scanner so we can read the command-line input
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Loan Type. Allowed values are: HL -Home Loan, PL -Personal Loan and CL -Car Loan\n");
		String loanType = scanner.next();

		System.out.println("Enter Loan amount. Only numeric values are allowed\n");
		double loanAmount = scanner.nextDouble();
		
		scanner.close();//Closing input reading scanner object. Best practice

		Loan loan = null;
		if (loanType.equals("HL")) 
		{
			loan = new HomeLoan(loanAmount);
		} 
		else if (loanType.equals("PL")) {
			loan = new PersonalLoan(loanAmount);
		} 
		else if (loanType.equals("CL")) {
			loan = new CarLoan(loanAmount);
		} 
		else {
			System.out.println("Invalid loan type entered.");
		}
		if(loan != null) {
			loan.greetingMessage();
			System.out.println("Interest rate is: " + loan.getRateOfInterest() + ", Max loan tenure is " + loan.getMaximumPeriod() + " years");	
		}		
		
		/*
		Loan loan = null;
		switch (loanType) {
		case "HL":
			loan = new HomeLoan(loanAmount);
			break;
		case "PL":
			loan = new PersonalLoan(loanAmount);
			break;
		case "CL":
			loan = new CarLoan(loanAmount);
			break;
		default:
			System.out.println("Invalid loan type entered.");
		}		
		if(loan != null) {
			loan.greetingMessage();
			System.out.println("Interest rate is: " + loan.getRateOfInterest() + ", Max loan tenure is " + loan.getMaximumPeriod() + " years");	
		}
		*/
	}

}
