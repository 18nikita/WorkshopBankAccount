package com.bridgelabz.bankaccount;

public class Ford extends Car {
	double amount;
	int year;

	public Ford(int speed, double salePrice, String color, int year) {
		super(speed, salePrice, color);
		this.year = year;
		
	}

	public double getSalePrice() {
		double manufacturerDiscount;
		if (year > 2000) {
			System.out.println("Ford car: Year is  greater than 2000: 10% discount");
			manufacturerDiscount=regularPrice * 10 /100;
			System.out.println("amount after discount=" + manufacturerDiscount);

		} else {

			System.out.println("Ford car: Year is  less than 2000: 20% discount:");
			manufacturerDiscount=regularPrice * 20 /100;
			System.out.println("amount after discount=" + manufacturerDiscount);

		}
		double salePrice=regularPrice-manufacturerDiscount;
		return salePrice;
	}
}
