package com.sneaky.main;

public class Customer {
	
	private String name;
	private String idNo;
	private double balance;
	private Item item;
	
	public Customer(String name, String idNo, double balance) {
		
		
		
		this.name = name;
		this.idNo = idNo;
		this.balance = balance;
		
	}

	public Customer(String name, String idNo) {
		
		this.name = name;
		this.idNo = idNo;
		this.balance = 5000;
		
	}
	
	public void print() {
		
		System.out.println("Item name: " + item.getItemName());
		System.out.println("Item ID no: " + item.getItemidNo());
		System.out.println("Item quantity: " + item.getItemQuantity());
		System.out.println("Item price: " + item.getItemPrice());
		System.out.println("Current balance: " + getBalance());
		
	}
	
	public void buyItem(Item item) {
		
		this.item = item;
		
		if(balance >= (item.getItemPrice()*item.getItemQuantity()) && item.getItemQuantity() >= 1) {
			
			balance = balance - (item.getItemPrice()*item.getItemQuantity());
			print();
			
		}
		
		else if(item.getItemQuantity() < 1)
			System.out.println("Order is not valid");
		
		else if(balance < (item.getItemPrice()*item.getItemQuantity()))
			System.out.println("Insufficient balance");
		
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the idNo
	 */
	public String getIdNo() {
		return idNo;
	}

	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * @return the item
	 */
	public Item getItem() {
		return item;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param idNo the idNo to set
	 */
	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}
	
	
	
}
