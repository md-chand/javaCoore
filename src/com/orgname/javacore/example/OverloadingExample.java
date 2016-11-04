package com.orgname.javacore.example;

/**
 * Method Overloading is also known as static polymorphism.
 * Method name should be same but not the method parameters. Return type may change
 *
 */
public class OverloadingExample {
	
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public int add(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	
	public String add(String string1, String string2) {
		return string1 + string2;
	}
	
	public static void main(String[] args) {
		
		OverloadingExample example = new OverloadingExample();
		
		System.out.println(example.add(3, 6));
		
		System.out.println(example.add(3, 6, 9));
		
		System.out.println(example.add("Hello", "World"));
	}

}
