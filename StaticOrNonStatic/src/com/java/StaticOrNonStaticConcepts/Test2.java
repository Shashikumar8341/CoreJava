package com.java.StaticOrNonStaticConcepts;

public class Test2 {
	public static void main(String[] args) {
		Test1 dt=new Test1();
//		dt.Test1();
//		dt.pintln();
		Test1.print();
		System.out.println(Test1.number);
		
	}
}
