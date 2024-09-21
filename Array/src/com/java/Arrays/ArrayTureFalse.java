package com.java.Arrays;

public class ArrayTureFalse {
	public static void main(String[] args) {
		boolean t[] = new boolean[4];
		t[0] = 1 < 2;
		t[1] = 35 < 65;
		t[2] = 4525 < 12;
		t[3] = 45 > 40;
		boolean g = 5 > 40;
//		boolean v=g;
		System.out.println(g);
		System.out.println("--------");
		System.out.println(t[0]);
		System.out.println("--------");
		System.out.println(t[1]);
		System.out.println("--------");
		System.out.println(t[2]);
		System.out.println("--------");
		System.out.println(t[3]);
	}
}
