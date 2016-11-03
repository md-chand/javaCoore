package com.orgname.javacore.example;

/**
 * @author MyPC
 * 
 */
public class Autoboxing {
	public static void main(String args[]) {
		int primitive = 50;
		Integer wrapper1 = primitive;
		Integer wrapper2 = new Integer(primitive);
		System.out.println(primitive + " " + wrapper1 + " " + wrapper2);
		testAutoboxing(primitive);
	}

	private static void testAutoboxing(Integer integerWrapper) {
		System.out.println("From testAutoboxing: " + integerWrapper);
	}
}
