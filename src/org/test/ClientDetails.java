package org.test;

import com.test.CompanyDetails;
import com.test.EmployeeInformation;

public class ClientDetails {
	
//method creation
	private void clientName() {
		System.out.println("client name is Suganya");
		
	}
	
	private void clientSalary() {
		System.out.println("SALARY IS 4500");
		
	}
	
	//MAINMETHOD CREATION
	public static void main (String[] args) {
		ClientDetails cd = new ClientDetails();
		cd.clientName();
		cd.clientSalary();
			
		EmployeeInformation objName = new EmployeeInformation();
		objName.employeename();
		objName.employeeId();
		CompanyDetails cs = new CompanyDetails ();
		cs.companyName();
		cs.companyAddress();	
		
		
		
	}
}
