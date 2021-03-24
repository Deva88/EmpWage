package com.empwage;

public class EmpWage {

	public static void main(String[] args) {

		// constants
		final int IS_PART_TIME = 1;
		final int IS_FULL_TIME = 2;
		final int EMP_RATE_PER_HR = 20;
		final int NUM_WORKING_DAY = 20;
		// VARIABLE
		int empHrs = 0;
		int salary = 0;
		int totalWorkingHrs = 0;
		int day;

		// calculating wages for total or maximum number of working days
		for (day = 1; day <= NUM_WORKING_DAY; day++) {
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			// checking each day working hrs
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
			System.err.println("Employee working Hours =" + empHrs);
			salary = empHrs * EMP_RATE_PER_HR;
			System.out.println("Employee Salary = " + salary);
		}

	}
}
