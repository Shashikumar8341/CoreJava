package com.java.Inheritens;

public class Builders extends HouseMaking {
	String name;
	double contractorAmount;
	int workMemebers;
	public Builders(String lang, int rod, String cement,String name,
			double contractorAmount,int workMemebers) {
		super(lang, rod, cement);

		this.name=name;
		this.workMemebers=workMemebers;
		this.contractorAmount=contractorAmount;
	}
	public String  name() {
		return name=name;
	}
	public int  workMemebers(int workMemebers) {
		return workMemebers=workMemebers;
	}
	public double contractorAmount() {
		return contractorAmount=contractorAmount;
	}
	//public static void main(String[] args) {
	//	Builders bd=new Builders("cocopeat",16, "birla", "balaji", 45000.00, 25);
	//bd.name="balaji";
	//bd.workMemebers=25;
	//bd.contractorAmount=45000.00;
	//System.out.println("name:"+bd.name);
	//System.out.println("workMemebers:"+bd.workMemebers);
	//System.out.println("contractorAmount:"+bd.contractorAmount);
	//System.out.println("lang:"+bd.lang);
	//System.out.println("rod:"+bd.rod);
	//System.out.println("cement:"+bd.cement);
	//
	//}
}