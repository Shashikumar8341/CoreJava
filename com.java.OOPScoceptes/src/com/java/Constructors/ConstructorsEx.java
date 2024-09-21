package com.java.Constructors;

public class ConstructorsEx {
	int a;

	public static void main(String[] args) {
		ConstructorsEx dc = new ConstructorsEx();
		System.out.println(dc.a);
	}

	public ConstructorsEx() {
		a = 20;// explicit Constructor
	}

	public ConstructorsEx(int a) {

	}
}
