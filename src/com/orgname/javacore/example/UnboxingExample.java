package com.orgname.javacore.example;

/**
 * @author MyPC
 * 
 */
public class UnboxingExample {
	public static void main(String args[]) {
		Integer wrapperInteger = new Integer(50);
		int primitiveInteger = wrapperInteger;
		System.out.println(primitiveInteger);
		testUnboxing(wrapperInteger);
	}

	private static void testUnboxing(int integerPrimitive) {
		System.out.println("From testUnboxing: " + integerPrimitive);
	}
}
