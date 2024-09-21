package com.java.StaticOrNonStaticConcepts;

import java.util.Random;

public class Test1 {
	static int number;

	public static void print() {
		System.out.println("sataic method");
	}

	public void println() {
		System.out.println("void method");
	}

	public static void main(String[] args) {
		Test1 st = new Test1();
		st.number = new Random().nextInt();
		System.out.println(st.number);
	}
}
