package com.test;
//child class
public class ClientDetails extends CompanyInfo {
	
	public void clientName() {
		System.out.println ("Client name is Suganya");
	}
public void clientSalary() {
	System.out.println ("Client Salary is 5000");
	
}
public static void main (String [] args) {
	ClientDetails CN = new ClientDetails();
	CN.clientName();
	CN.clientSalary();
	
}
}