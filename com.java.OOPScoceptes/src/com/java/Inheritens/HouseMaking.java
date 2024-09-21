package com.java.Inheritens;

public class HouseMaking {
	String lang;
	int rod;
	String cement;
	public HouseMaking(String lang,int rod,String cement) {

		this.lang=lang;
		this.rod=rod;
		this.cement=cement;
	}
	public String getlang() {
		return lang;
	}
	public int getrod() {
		return rod;
	}
	public String getcement() {
		return cement;
	}
	//public static void main(String[] args) {
	//	HouseMaking hm=new HouseMaking("cocopeat", 16, "birla");
	//	hm.cement="birla";
	//	hm.lang="cocopeat";
	//	hm.rod=16;
	//	System.out.println("lang:"+hm.lang);
	//	System.out.println("rod:"+hm.rod);
	//	System.out.println("cement:"+hm.cement);
	//	}
}