package com.empwage;

public class EmpWage {

	// constants
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	
	public static int computeEmpWge(String company, int empRatePerHour, int numOfWokingDays, int maxHoursPerMonth) {
		
		//local variables
				int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
				//computation
				while (totalEmpHrs <= maxHoursPerMonth  && totalWorkingDays < numOfWokingDays)
				{
					totalWorkingDays++;
					int empCheck = (int) Math.floor(Math.random() * 10) % 3;

					switch (empCheck) {
					case IS_PART_TIME:
						empHrs = 4;
						break;
					case IS_FULL_TIME:
						empHrs = 8;
						break;
					default:
						empHrs = 0;
					}

					totalEmpHrs += empHrs;
					System.out.println("Day#:" + totalWorkingDays + " Emp Hr: " + empHrs);
					
				}
				// total salary of employee
				int totalEmpWage = totalEmpHrs * empRatePerHour;
				System.out.println("Total Emp Wage for company: " +company+" is " + totalEmpWage);
				return totalEmpWage;
			}
	public static void main(String[] args) {
		
		computeEmpWge("DMart", 20, 2, 10);
		computeEmpWge("Reliance", 10, 4, 20);
		
	}
}