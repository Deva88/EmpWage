package com.empwage;

public class EmpWage {

	public static void main(String[] args) {

		// constants
		final int EMP_RATE_PER_HR = 20;
		final int IS_FULL_TIME_HRS = 8;

		// variables
		int isPresent = 1;
		int salary = 0;
		int empHrs;

		// computation
		double empCheck = Math.floor(Math.random() * 10) % 2;

		// checking how many hrs employee has worked
		if (empCheck == isPresent)
			empHrs = 8;
		else
			empHrs = 0;
		salary = empHrs * EMP_RATE_PER_HR;
		System.out.println("Salary = " + salary);

	}

}
