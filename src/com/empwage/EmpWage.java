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

		// checking how many hrs employee has worked
		double empCheck = Math.floor(Math.random() * 10) % 3;
		if (IS_FULL_TIME == empCheck)
			empHrs = 8;
		else if (IS_PART_TIME == empCheck)
			empHrs = 4;
		else
			empHrs = 0;
		salary = empHrs * EMP_RATE_PER_HR;
		System.out.println("Salary = " + salary);

	}

}
