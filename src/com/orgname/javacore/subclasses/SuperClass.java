package com.orgname.javacore.subclasses;

/**
 * @author MyPC
 * 
 */
public class SuperClass {
	/**
	 * Protected members are accessible to the same package classes and the sub
	 * classes of this (SuperClass) no matter in which package they are into
	 */
	protected String name;
	private Long id;

	protected String getName() {
		name = "QWERTY";
		;
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
