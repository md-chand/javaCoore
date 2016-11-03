package com.orgname.javacore.oops;

import com.orgname.javacore.example.LiteralsExample;

/**
 * @author MyPC
 *
 */
public class Employee extends LiteralsExample{
	
	//Variables
	private String empName;
	private Long empId;
	private String adress;
	
	//Below are Methods of this classes
	
	public String getEmpName() {
		return empName;		
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Long getEmpId() {
	    getEmpId();
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}	
}
