package com.orgname.javacore.example;

/**
 * @author MyPC
 * 
 * Static access modifier can be applied to class members (methods and variables) but not to class.
 * If a variable declared as static, the can be accessed without creating the object of their class. Hence they called class variables.
 * If a method is declared as static, then that method can be access from other classes just by class name without creating object.
 * Non static variables can not be used inside static method. Where as static variable can be used in static and non static method as well.
 * If a super class has static method, then sub class can not override it.
 * 
 */
public class StaticMemberClass {

	public static String staticString = "XYZ";

	private static int staticInt = 10;
	private static long staticLong = 15L;
	private long nonStaticLong = 20L;

	// non-static method can access static variables inside
	public int getStaticInt() {
		return staticInt;
	}

	public long testStaticLongVariable() {
		return staticLong;
	}

	// static method can access only static variables inside but not non static
	public static int testStaticIntVariable() {
		return staticInt;
	}

	// Accessing non static variable inside static method which gives error
	/*
	 * public static long testStaticVariableInNonStaticMethod() { 
	 * 	return nonStaticLong; 
	 * }
	 */
}
