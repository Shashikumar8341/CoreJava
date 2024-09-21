package com.java.Arrays;

import java.util.Scanner;

public class StaticInitialization {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);{
		System.out.println("enter the sum number");
		
			int s=sc.nextInt();
			for (int d1 = 1; d1 <=12; d1++) {
				System.out.println(s+"*"+d1+"="+d1*s);

			}	}
				short[]d=new short [6];

				d[0]=1;
				d[1]=2;
				d[2]=3;
				d[3]=4;
				d[4]=5;
				d[5]=6;
				int[]f=new int [6];
				f[0]=1;
				f[1]=2;
				f[2]=3;
				f[3]=4;
				f[4]=5;
				f[5]=6;
				System.out.println("\n");
				System.out.println(f.length);
				System.out.println("\n");
				//for loop
				for (int i = 0; i < f.length; i++) {
					System.out.println(f[i]);
				}
				System.out.println("....");
					// for-each loop
					for (int s : d) {
						System.out.println(s);
					}
				
				
				
	}}