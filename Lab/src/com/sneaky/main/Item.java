package com.sneaky.main;

public class Item {
	
	private String itemName;
	private String itemidNo;
	private int itemQuantity;
	private double itemPrice;
	
	public Item(String itemName, String itemidNo, int itemQuantity, double itemPrice) {
		
		this.itemName = itemName;
		this.itemidNo = itemidNo;
		this.itemQuantity = itemQuantity;
		this.itemPrice = itemPrice;
		
	}
	

	public Item(String itemName, String itemidNo, int itemQuantity) {
		
		this.itemName = itemName;
		this.itemidNo = itemidNo;
		this.itemQuantity = itemQuantity;
		this.itemPrice = 500;
		
	}

	public Item(String itemName, String itemidNo) {
		
		this.itemName = itemName;
		this.itemidNo = itemidNo;
		this.itemQuantity = 1;
		this.itemPrice = 500;
		
	}
	
	
	/**
	 * @return the itemName
	 */
	public String getItemName() {
		return itemName;
	}
	/**
	 * @param itemName the itemName to set
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	/**
	 * @return the itemidNo
	 */
	public String getItemidNo() {
		return itemidNo;
	}
	/**
	 * @param itemidNo the itemidNo to set
	 */
	public void setItemidNo(String itemidNo) {
		this.itemidNo = itemidNo;
	}
	/**
	 * @return the itemQuantity
	 */
	public int getItemQuantity() {
		return itemQuantity;
	}
	/**
	 * @param itemQuantity the itemQuantity to set
	 */
	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
	/**
	 * @return the itemPrice
	 */
	public double getItemPrice() {
		return itemPrice;
	}
	/**
	 * @param itemPrice the itemPrice to set
	 */
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	
}
