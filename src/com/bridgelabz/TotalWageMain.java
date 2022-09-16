/**
 * 
 */
package com.bridgelabz;

/**
 * @author ASUS
 *
 */
public abstract class TotalWageMain {

	/**
	 * @param args
	 */

	public static final int NUM_OF_WORKING_DAYS = 20;
	protected final static int EMP_HOURS = 8;
	protected static final String EMP_NAME = "Geo M.";
	public static final int WAGE_PER_DAY = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpWageBuilderUC9.computeEmpWage("IBM", 200, 26, 192);
		EmpWageBuilderUC9.computeEmpWage("MICROSOFT", 100, 20, 80);
		EmpWageBuilderUC9.computeEmpWage("Apple", 90, 10, 110);
		System.out.println(EMP_NAME);

		System.out.println("-------- UC 10 -----------");
		CompanyEmpWageUC10[] ucten = new CompanyEmpWageUC10[3];
		ucten[0]= new CompanyEmpWageUC10("Google", 100, 15, 110);
		ucten[1]= new CompanyEmpWageUC10("MPhasis", 100, 15, 110);
		ucten[2]= new CompanyEmpWageUC10("Infosys", 100, 15, 110);
		//	ucten[3]= new CompanyEmpWageUC10("TCS", 100, 15, 110);


		//Using Interface
		System.out.println();
		System.out.println("-------- UC 11 -----------");
		Wage newWage = new MultipleCompaniesUC11();
		newWage.employeeWage();


		//Using Array List 
		System.out.println();
		System.out.println("-------- UC 12 -----------");
		EmployeeWageUC12 companyName = new EmployeeWageUC12();
		companyName.empWageList(200, 63, 50);

		//UC 13
		System.out.println();
		System.out.println("-------- UC 13 -----------");

		StoreDailyWageUC13 dailyWage = new StoreDailyWageUC13();
		dailyWage.computeEmpWage(100, 30, 8);

		//UC 14
		System.out.println();
		System.out.println("-------- UC 14 -----------");
		EmpWageBuilderUC14.totalWageByCompany();


	}
}