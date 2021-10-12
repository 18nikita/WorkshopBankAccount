package com.bridgelabz.bankaccount;

public class Sedan extends Car {
	int length;
	double amount;

	public Sedan(int speed, double regularPrice, String color, int length) {
		super(speed, regularPrice, color);
		this.length = length;
	}

	public double getSalePrice() {
		double discount, salePrice;
		if (length > 20) {
			System.out.println("Sedan: Length is  greater than 2000: 5% discount:");
			 discount=regularPrice * 5/100 ;
			System.out.println("amount after discount=" + amount);

		} else {

			System.out.println("Sedan: Length is  less than 2000: 10% discount:");
			 discount=regularPrice * 10/100 ;
			System.out.println("amount after discount=" + amount);
		}
		salePrice=regularPrice-discount;
		return salePrice;
	}
}
