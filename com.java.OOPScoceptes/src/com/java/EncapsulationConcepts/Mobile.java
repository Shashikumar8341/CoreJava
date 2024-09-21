package com.java.EncapsulationConcepts;

public class Mobile {
	private	String brandname="MI";
	private String mblName="XAiOMI";
	private double amount=24599.00;
	private int mbltypes=4;
	public Mobile(){ 
	}
	public Mobile(String brandname,String mblName,double amount,int mbltypes) {
		this.amount=amount;
		this.brandname=brandname;
		this.mbltypes=mbltypes;
		this.mblName=mblName;
	}
	public void getbrandname() {
		System.out.println("brandname:"+brandname);
	}
	public void getmblName() {
		System.out.println("mblName:"+mblName);
	}
	public void getmbltypes() {
		System.out.println("mbltypes:"+mbltypes);
	}
	public void getamount() {
		System.out.println("amount:"+amount);
	}
//	public static void main(String[] args) {
//		Mobile mbl=new Mobile();
//		mbl.getbrandname();
//		mbl.getmblName();
//		mbl.getmbltypes();
//		mbl.getamount();
//	}
}