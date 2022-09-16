/**
 * 
 */
package com.bridgelabz;

import java.util.ArrayList;

/**
 * @author ASUS
 *
 */
public class EmpWageBuilderUC14 extends TotalWageMain {

	public static void totalWageByCompany() {
		
		  ArrayList<Object> companyName = new ArrayList<>();
	       	companyName.add("Alphabet");
	       	
		//variables
		int dailyHour = 8;
		int noOfDays=30;
		int DailyWage;
		int totalEmpHrs = 192;
				int EmployeeRatePerHr = 25;
		DailyWage = WAGE_PER_DAY * dailyHour;
		
		int monthlyWage = DailyWage * noOfDays;
		
		 totalEmpHrs = EMP_HOURS + totalEmpHrs;

		System.out.println(EMP_NAME);
	 int totalEmployeeWage = totalEmpHrs * EmployeeRatePerHr;
	 System.out.println("Monthy wage is : " + monthlyWage + " for the Company" + companyName);
		 System.out.println("Total wage for employee is: " + totalEmployeeWage  + " for the Company" + companyName);
		
}
	
	
}
