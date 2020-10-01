package com.lab2.main;

public class MyStatic {
	
	int a; // initialised to 0
	static int b; // initialised to 0 only when class is loaded, not obj created
	
	// Constructor incrementing static variable b
	MyStatic() { b++; }
	
	public void showData() {
		
		System.out.println("Value of a = " + a);
		System.out.println("Value of b = " + b);
		
	}
	
//	public static void increment() {
//		
//		a++;
//		
//	}
	
}

class staticDemo {
	public static void main(String[] args) {
		
		MyStatic s1 = new MyStatic();
		s1.showData();
		MyStatic s2 = new MyStatic();
		s2.showData();
		
//		MyStatic.b++;
//		s1.showData();
		
	}
}