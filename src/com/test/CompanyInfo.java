package com.test;
//parentclass
public class CompanyInfo {
	//method creation
	public void companyName() {
	System.out.println("company Name is TCS");
	}
	public void companyAddress() {
		System.out.println("CompanyAddress is Chennai");
	}
//main method
	public static void main (String[] args) {
		CompanyInfo cf = new CompanyInfo();
		cf.companyName();
		cf.companyAddress();
		
	}
	
	
}
