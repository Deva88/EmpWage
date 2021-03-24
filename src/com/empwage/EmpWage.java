package com.empwage;

public class EmpWage {

	public static void main(String[] args) {

		// constants
		final int IS_PART_TIME = 1;
		final int IS_FULL_TIME = 2;
		final int EMP_RATE_PER_HR = 20;
		final int NUM_WORKING_DAY = 20;
		final int TOTAL_WORKING_HR = 100;
		// VARIABLE
		int empHrs = 0;
		int salary = 0;
		int day = 0;
		int totalWorkingHrs = 0;

		// checking whether the maximum days or maximum hrs
		while (day < NUM_WORKING_DAY && totalWorkingHrs < TOTAL_WORKING_HR) {
			day++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;

			// checking how much employee has worked daily
			switch (empCheck) {
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			case IS_PART_TIME:
				empHrs = 4;
				break;
			default:
				empHrs = 0;
			}
			System.out.println("Employee Working Hrs =" + empHrs);

			// adding daily empHrs to get total Working hour
			totalWorkingHrs = totalWorkingHrs + empHrs;

			// total salary of employee
			salary = totalWorkingHrs * EMP_RATE_PER_HR;
			System.out.println("Employee Salary = " + salary);

		}
	}
}