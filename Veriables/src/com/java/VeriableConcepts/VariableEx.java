package com.java.VeriableConcepts;

public class VariableEx {
	String name;
	long mobile;
	String dressColor;
	int hight;
	int wight;
	String gender;
	public void getVariableEx() {
		System.out.println("name:"+name);
		System.out.println("mobile:"+mobile);
		System.out.println("dresscolor:"+dressColor);
		System.out.println("hight:"+hight);
		System.out.println("wight:"+wight);
		System.out.println("gender:"+gender);
		
	}
	public static void main(String[] args) {
		VariableEx get=new VariableEx();
		get.name="darling";
		get.mobile=8341866042L;
		get.hight=156;
		get.wight=52;
		get.gender="male";
		get.getVariableEx();
		System.out.println("\n");
//		System.out.println("mobile:"+get.mobile);

	}
}

