package com.java.Constructors;

public class ToSting {

	 int b() {
		return 12;
	}
	 
	 boolean a() {
			return false;

	 }
	 long c() {
			return 5;

	 }
	 byte g() {
			return 6;

	 }
	 public ToSting() {
			super();
		}
		
	public static void main(String[] args) {
		ToSting ts=new ToSting();
		System.err.println(ts.b());
		System.out.println(ts.a());
		System.err.println(ts.c());
		System.out.println(ts.g());
	}

}
