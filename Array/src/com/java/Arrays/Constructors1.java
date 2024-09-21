package com.java.Arrays;

public class Constructors1{

//	public Constructors1(String bulidingName, String bulidingStrength, int bulidingRooms) {
//		super(bulidingName, bulidingStrength, bulidingRooms);
//	}
public static void totalvolue() {
	Constructors ct = new Constructors("laxminivas", "25years", 8);
	Constructors ct1 = new Constructors("royal", "20years", 10);
	Constructors ct2 = new Constructors("hometown", "35years", 5);
	Constructors ct3 = new Constructors("mahakali", "15years", 4);
	Constructors[] constructors = { ct, ct1, ct2, ct3 };
	for (Constructors constructors2 : constructors) {
		constructors2.getdetails();
	}
}
	public static void main(String[] args) {
		Constructors1 c1=new Constructors1();
		c1.totalvolue();

}
}