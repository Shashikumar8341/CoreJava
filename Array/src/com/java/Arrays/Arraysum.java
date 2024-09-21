package com.java.Arrays;

public class Arraysum {
	public static void main(String[] args) {

		int laptop = 0;
		int chai = 1;
		int coffee = 2;
		int bike = 3;
		int book = 4;

		int[] name = new int[6];
		name[0] = 1;
		name[1] = 2;
		name[2] = 3;
		name[3] = 4;
		name[4] = 5;
		name[5] = 6;
		int max=name[5];
		int min=name[0];
		System.out.println(max);
		System.out.println(min);
		System.out.println("\r");
		System.out.println("laptop:" + laptop);
		System.out.println("chai:" + chai);
		System.out.println("coffee:" + coffee);
		System.out.println("bike:" + bike);
		System.out.println("book:" + book);
		System.out.print("\r");
		//addition total number
		int totalnumber = name[0] + name[1] + name[2] + name[3] + name[4] + name[5];
		System.out.println("totalnumber:" + totalnumber);
		//For-each loop
		for (int i : name) {
			System.err.println(i);
		}	}
}
