package com.orgname.javacore.example;

/**
 * @author MyPC
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

	// Accessing non static variable inside static method
	/*
	 * public static long testStaticVariableInNonStaticMethod() { return
	 * nonStaticLong; }
	 */
}
