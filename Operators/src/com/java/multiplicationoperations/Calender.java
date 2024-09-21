package com.java.multiplicationoperations;

public class Calender {
	public static void main(String args[]) {
		
		int number=28;
		
		
		if(number==30) {
			System.out.println("april, jun, sep, nov");
		}else if (number==28||number==29) {
			System.out.println("Feburay");
		}
		else if (number==31) {
			System.out.println("january, march, may, july, augest, oct, dec");
		}else {
			System.out.println("please enter a valid number");
		}
	
	}
}
