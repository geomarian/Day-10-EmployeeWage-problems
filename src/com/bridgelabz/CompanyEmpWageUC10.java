/**
 * 
 */
package com.bridgelabz;

/**
 * @author ASUS
 *
 */
public class CompanyEmpWageUC10 extends TotalWageMain {
	
//	public CompanyEmpWageUC10(String string, int i, int j, int k) {
//		// TODO Auto-generated constructor stub
//	}

	public CompanyEmpWageUC10(String EmpCompany, int EmployeeRatePerHr,
			int numOfWorkingDays, int hoursPerMonth) {
		
		
		//variables
		
		int totalEmpHrs=100;
		
		totalEmpHrs = EMP_HOURS + totalEmpHrs;

		 int totalEmployeeWage = totalEmpHrs * EmployeeRatePerHr;
	
		 System.out.println("Total Employee wage for company is: " + EmpCompany + " is: " + totalEmployeeWage);
		return;

}
}
