package com.test;

public class CompanyDetails {
	
	public void companyName() {
		System.out.println ("company Name is TSC");
		
	}
public void companyAddress() {
	System.out.println ("Companya Address is chennai");
	 
}

public static void main(String[] args) {
	//object creation
	CompanyDetails cs = new CompanyDetails ();
	cs.companyName();
	cs.companyAddress();	
	
	EmployeeInformation objName = new EmployeeInformation();
	objName.employeename();
	
}

}
