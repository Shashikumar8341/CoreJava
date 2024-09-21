package com.java.VeriableConcepts;

public class ElectricityDemo {
	static double rupess;
	static double units;

	public void ElectricityDemo() {

		System.out.println("rupess:" + rupess);
		System.out.println("units:" + units);
	}

	public static void main(String[] args) {
		ElectricityDemo web = new ElectricityDemo();
		web.rupess = 200.0;
		web.units = 10.0;
		double totall = rupess * units;
		web.ElectricityDemo();
//		 System.out.println(web.ElectricityDemo);
	}

}