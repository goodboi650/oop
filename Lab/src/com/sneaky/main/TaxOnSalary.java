package com.sneaky.main;

import java.util.Scanner;

public class TaxOnSalary {
	
	private double salary;
	private boolean isPANsubmitted;
	
	public TaxOnSalary(boolean isPANsubmitted) {
		
		this.isPANsubmitted = isPANsubmitted;
		this.salary = 1000.00;
		
	}
	
	public TaxOnSalary() {
		
		this.isPANsubmitted = false;
		this.salary = 0.0;
		
	}
	
	public double calculateTax() {
		
		if(getSalary() < 180000 && isPANsubmitted()) return 0;
		else if(getSalary() < 180000 && !isPANsubmitted()) return 0.05*getSalary();
		else if(getSalary() >= 180000 && getSalary() < 500000) return 0.1*getSalary();
		else if(getSalary() >= 500000 && getSalary() < 1000000) return 0.2*getSalary();
		else return 0.3*getSalary();
	}
	
	public void inputSalary() {
		
		Scanner in = new Scanner(System.in);
		this.salary = in.nextDouble();
		in.close();
		
	}
	
	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * @return the isPANsubmitted
	 */
	public boolean isPANsubmitted() {
		return isPANsubmitted;
	}
	
}
