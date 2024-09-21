package com.java.Arrays;

public class Notes {

	public static void main(String[] args) {
		int amount = 575;
		int notes500, notes200, notes100, notes50, notes20, notes10, notes5;

		notes500 = notes200 = notes100 = notes50 = notes20 = notes10 = notes5 = 0;
		System.out.println("Enter amount: ");
		System.out.printf("%d", amount);

		if (amount > 500) {
			notes500 = amount / 500;
			amount -= notes500 * 500;
		}
		if (amount > 200) {
			notes100 = amount / 200;
			amount -= notes100 * 200;
		}
		if (amount > 100) {
			notes100 = amount / 100;
			amount -= notes100 * 100;
		}
		if (amount > 50) {
			notes50 = amount / 50;
			amount -= notes50 * 50;
		}
		if (amount > 20) {
			notes20 = amount / 20;
			amount -= notes20 * 20;
		}
		if (amount > 10) {
			notes10 = amount / 10;
			amount -= notes10 * 10;
		}
		if (amount > 5) {
			notes5 = amount / 5;
			amount -= notes5 * 5;
		}
		notes5 = amount;
		System.out.printf("Total number of notes = \n");
		System.out.printf("500 = %d\n", notes500);
		System.out.printf("200 = %d\n", notes200);
		System.out.printf("100 = %d\n", notes100);
		System.out.printf("50 = %d\n", notes50);
		System.out.printf("20 = %d\n", notes20);
		System.out.printf("10 = %d\n", notes10);
		System.out.printf("5 = %d\n", notes5);

	}
}