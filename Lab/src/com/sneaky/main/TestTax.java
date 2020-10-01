package com.sneaky.main;

public class TestTax {
	
	public static void main(String[] args) {
		
		TaxOnSalary tax1 = new TaxOnSalary(true);
		TaxOnSalary tax2 = new TaxOnSalary();
		
		tax1.inputSalary();
		tax2.inputSalary();
		
		System.out.println("Tax for 1st instance: " + tax1.calculateTax());
		System.out.println("Tax for 2nd instance: " + tax2.calculateTax());
		
	}
	
}
