package com.java.VeriableConcepts;

public class ElectricityEx {
static double price;
public static void main(String[] args) {
//	ElectricityEx tin=new ElectricityEx();//object
	 System.out.println("Enter number of units for calculating electricity bill.");
	 int units = 0;
	if(units<=400) {
		double price=400*10;
		System.out.println("electricity bill:"+ units+"is:"+ price);

	}
	else if(units<=200) {
		double price=200*20;
		System.out.println("electricity bill:"+ units+"is:"+ price);

	}
	else if(units<=300) {
		double price=100*3+200*20;
		System.out.println("electricity bill:"+ units+"is:"+ price);

	}
	else if(units<=400) {
		double	price=100*10+200*40;
	}
System.out.println("electricity bill:"+ units+"is:"+ price);
}

}
