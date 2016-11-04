package com.orgname.javacore.interface_;

public interface LoanInterface {

	// Below variable is public static and final by default
	String welcomeMessage = "Welcome to ICICI Bank loan service";

	// All the methods of an Interface are abstract by default. adding abstract to method is optional
	public double getRateOfInterest();

	public int getMaximumPeriod();

}
