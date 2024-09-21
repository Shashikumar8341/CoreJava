package com.java.EncapsulationConcepts;

public class UsersOfPhone extends Mobile {
	private int Members;
	private	boolean CorrectorNot;
	public UsersOfPhone() {
	}

	public UsersOfPhone(String brandname, String mblName, double amount,
			int mbltypes,int Members,boolean CorrectorNot) {
		super(brandname, mblName, amount, mbltypes);
		this.Members=Members;
		this.CorrectorNot=CorrectorNot;
	}
	public boolean getCorrectorNot() {
		return CorrectorNot=false;
	}
	public boolean setCorrectorNot() {
		return CorrectorNot=getCorrectorNot();
	}
	public int Members() {
		return Members=4;
	}
	public static void main(String[] args) {
		UsersOfPhone up=new UsersOfPhone();
		up.getbrandname();
		up.getmblName();
		up.getmbltypes();
		up.getamount();
		up.setCorrectorNot();
	System.out.println(up.Members()+" "+up.getCorrectorNot());
	}}
