package com.orgname.javacore.superclass;

import com.orgname.javacore.subclasses.SuperClass;

/**
 * @author MyPC
 * 
 */

public class SubClassProtectedTest extends SuperClass {
	/**
	 * No exception to the protected class members. Being parent members they
	 * are accessible to all the child members. Only private members of Super
	 * class are not accessible in child classes
	 */

	public void testProtectedMethod() {
		// Note that get name is in SuperClass
		System.out.println(getName());
	}

}
