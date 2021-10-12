package com.bridgelabz.bankaccount;

public class MyOwnAutoShop {

	public static void main(String[] args) {
		Truck truck=new Truck(60,200000, "Black", 2005);
		truck.getSalePrice();
		
		Ford ford=new Ford(60, 200000, "Red", 2005);
		ford.getSalePrice();
		
		Sedan sedan=new Sedan(60, 200000, "Blue", 25);
		sedan.getSalePrice();
		
		
		}

}
