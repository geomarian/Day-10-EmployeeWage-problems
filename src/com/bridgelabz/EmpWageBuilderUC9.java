/**
 * 
 */
package com.bridgelabz;

/**
 * @author ASUS
 *
 */
public class EmpWageBuilderUC9 extends TotalWageMain {

		
		public static  int computeEmpWage(String EmpCompany, int EmployeeRatePerHr,
				int numOfWorkingDays, int hoursPerMonth) {
			
			
			//variables
			
			int totalEmpHrs=100;
			
			totalEmpHrs = EMP_HOURS + totalEmpHrs;
	
			//System.out.println(EMP_NAME);
			 int totalEmployeeWage = totalEmpHrs * EmployeeRatePerHr;
		
			 System.out.println("Total Employee wage for company is: " + EmpCompany + " is: " + totalEmployeeWage);
			return NUM_OF_WORKING_DAYS;
		
		
	}
		
		
		
	
	}

	

