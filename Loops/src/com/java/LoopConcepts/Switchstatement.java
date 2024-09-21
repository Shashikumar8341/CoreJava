
package com.java.LoopConcepts;

import java.util.Scanner;

public class Switchstatement {
	public static void main(String args[]) {
//		int j = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  month in number");
		for (int Case = 1; Case <= 12; Case++) {

		int month =sc.nextInt();
//			

			switch (month) {
			case 1:
				System.out.println("jan");
				;
				break;
			case 2:
				System.out.println("feb");
				;
				break;
			case 3:
				System.out.println("mar");
				;
				break;
			case 4:
				System.out.println("apr");
				;
				break;
			case 5:
				System.out.println("may");
				;
				break;

			case 6:
				System.out.println("jun");
				break;

			case 7:
				System.out.println("july");
				;
				break;
			case 8:
				System.out.println("ags");
				;
				break;
			case 9:
				System.out.println("sep");
				;
				break;
			case 10:
				System.out.println("oct");
				;
				break;
			case 11:
				System.out.println("nov");
				;
				break;

			case 12:
				System.out.println("dec");
				;

				break;
			
			}
		
		}
	}

}
