package com.java.Arrays;

import java.util.Arrays;

public class Array1 {
	public static void main(String args []) {
		// find the max-value an array&print with its the index
		// 25196
		double [] s = new double[5];

		s[0] = 2;
		s[1] = 5;
		s[2] = 1;
		s[3] = 9;
		s[4] = 6;
		int a[] = new int[5];
		a[0] = 10;
		a[1] = 20;
		a[2] = 70;
		a[3] = 40;
		a[4] = 50;
//		System.out.println(a[2]);
//		System.out.println();
		for (int j = 0; j < s.length; j++) {
			System.out.println(s[j]);
		}
//		System.out.print(a[0] + a[1] + a[2] + a[3] + a[4]);
//
//		System.out.println("name:"+"baby");
		Arrays.sort(a);
		for(int j:a);
		System.out.println(a);
	}
}

