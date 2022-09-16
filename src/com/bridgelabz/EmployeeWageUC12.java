/**
 * 
 */
package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author ASUS
 *
 */
public class EmployeeWageUC12 extends TotalWageMain {
	
	
	public static  void empWageList(int EmployeeRatePerHr,
			int numOfWorkingDays, int hoursPerMonth) { 
	
	    ArrayList companyName = new ArrayList();
	       
		companyName.add("Twitter");
		companyName.add("META");
		companyName.add("LinkedIN");
		int totalEmpHrs=100;
		
		totalEmpHrs = EMP_HOURS + totalEmpHrs;

		 int totalEmployeeWage = totalEmpHrs * EmployeeRatePerHr;
	
		 System.out.println("Monthly Employee wage for company is: " + companyName + " is: " + totalEmployeeWage);
	}
 }

