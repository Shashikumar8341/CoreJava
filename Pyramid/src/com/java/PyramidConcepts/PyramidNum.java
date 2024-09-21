package com.java.PyramidConcepts;

public class PyramidNum {
	public static void main(String[] args) {
		int i, k;
		for (i = 0; i <5; i++) {

			for (k = 5; k > i; k--) {
				System.out.print( k);
			}
			System.out.println('\n');
		}
	}
}
