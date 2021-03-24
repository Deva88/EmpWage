package com.empwage;

public class EmpWage {

	public static void main(String[] args) {

		// constants
		final int IS_PART_TIME = 1;
		final int IS_FULL_TIME = 2;
		final int EMP_RATE_PER_HR = 20;
		// variables
		int empHrs = 0;
		int salary = 0;

		// computing employee daily working hrs
		int empCheck = (int) Math.floor(Math.random() * 10) % 3;
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
		salary = empHrs * EMP_RATE_PER_HR;
		System.out.println("Salary = " + salary);
	}

}
