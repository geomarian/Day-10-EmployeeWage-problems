/**
 * 
 */
package com.bridgelabz;

/**
 * @author ASUS
 *
 */
public class MultipleCompaniesUC11 implements Wage {

	@Override
	public void employeeWage() {
		// TODO Auto-generated method stub
		int totalEmpHrs=100;
		int empHours = 8;
		int EmployeeRatePerHr = 20;
		totalEmpHrs = empHours + totalEmpHrs;
		String EmpCompany = "HCL";

		//System.out.println(EMP_NAME);
		 int totalEmployeeWage = totalEmpHrs * EmployeeRatePerHr;
	
		 System.out.println("Total Employee wage for company is: " + EmpCompany + " is: " + totalEmployeeWage);
		
	}

	
	
	
	
	
}
