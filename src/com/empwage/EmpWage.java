package com.empwage;

public class EmpWage {

	// constants
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HR = 20;
	public static final int NUM_WORKING_DAY = 2;
	public static final int MAX_HRS_IN_MONTH = 10;

	// class method to get working hour of a employee for a day
	public static int computingEmpWage() {
		// variables
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDay = 0;
		// computation
		while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDay < NUM_WORKING_DAY) {
			totalWorkingDay++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			// checking how much employee has worked daily
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
			// adding daily empHrs to get total Working hour he has worked
			totalEmpHrs += empHrs;
			System.out.println("Day#:" + totalWorkingDay + " Emp Hr: " + empHrs);
		}
		// total salary of employee
		int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HR;
		System.out.println("Total Emp Wage: " + totalEmpWage);
		return totalEmpWage;
	}

	public static void main(String[] args) {
		computingEmpWage();

	}

}