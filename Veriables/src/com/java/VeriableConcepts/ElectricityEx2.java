package com.java.VeriableConcepts;

public class ElectricityEx2 {
//double units;
//double pay;
double totallprice;
public void netElectricityEx2(double units,double pay) {
//	double units=100;
//	double pay=10;
	if(units<=100){
	  this.totallprice= units* pay;
	System.out.println("Enter number of units for calculating electricity bill:"+totallprice);
}
	else if(units<=200){
		totallprice= units* pay;
		System.out.println("Enter number of units for calculating electricity bill:"+totallprice);
	}
	else if(units<=300){
	totallprice= units* pay;
	System.out.println("Enter number of units for calculating electricity bill:"+totallprice);
	}
	else if (units<=400){
	totallprice= units* pay;
	System.out.println("Enter number of units for calculating electricity bill:"+totallprice);
	}
}
public static void main(String[] args) {
	ElectricityEx2 sc=new ElectricityEx2();
	sc.netElectricityEx2(200.00,20.00);
}
}
