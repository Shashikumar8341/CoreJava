package com.java.polymarization;

public class MethodOverLoading {
	public String num(String a, String b) {
		return(a+b);
	}

	public long num(long a, long b) {
		return(a+b);
	}

	public  short num(short a, short b) {
		return (short) (a+b);
	}
	public static void main(String args[]) {
		MethodOverLoading cu = new MethodOverLoading();
//		cu.num(20L,30L);
//		cu.num(25,30);
//		cu.num("shashi","kumar");
		System.out.println(cu.num(20L , 30L));
		System.out.println(cu.num(25 , 30));
		System.out.println(cu.num("sony","Shashikumar"));
	}
}