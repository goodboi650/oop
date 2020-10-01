package com.sneaky.main;

public class TestStore {
	
	public static void main(String[] args) {
		
		Customer customer = new Customer("Aaron", "17A", 1500);
		Item item1 = new Item("Sword", "dimSwd", 1);
		Item item2 = new Item("Shield", "shld", 3, 300);
		
		customer.buyItem(item1);
		customer.buyItem(item2);
		
	}
	
}
