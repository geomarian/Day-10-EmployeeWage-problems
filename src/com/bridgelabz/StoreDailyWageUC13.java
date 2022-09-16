/**
 * 
 */
package com.bridgelabz;

/**
 * @author ASUS
 *
 */
public class StoreDailyWageUC13 extends TotalWageMain {

	
	public static void computeEmpWage(int EmployeeRatePerHr,
			int numOfWorkingDays, int hoursPerMonth) {
		
		
		//variables
		int dailyHour = 8;
		int noOfDays=30;
		int DailyWage;
		
		DailyWage = WAGE_PER_DAY * dailyHour;
		
		int monthlyWage = DailyWage * noOfDays;
		
	//	totalEmpHrs = EMP_HOURS + totalEmpHrs;

		//System.out.println(EMP_NAME);
		// int totalEmployeeWage = totalEmpHrs * EmployeeRatePerHr;
	
		 System.out.println("Daily  wage for employee is: " + DailyWage );
		System.out.println("Monthy wage is : " + monthlyWage);
}
}
