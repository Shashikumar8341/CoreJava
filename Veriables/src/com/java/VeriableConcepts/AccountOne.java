package com.java.VeriableConcepts;

public class AccountOne {
	String Name;
	String p; 
	double Rs;
	String b;

	public  void deposit(int amount) {
		if (amount<=0);
		Rs+=Rs;
	}
	public double seeamount(){
		return Rs;
		
	}
	public int withdraw(double amount) {
		if (amount<=0);{
		Rs=Rs-amount;	
	}
		return (int) Rs;
	}
	
	public void netAccountOne() {
		System.out.println("Name:"+Name);
		System.out.println("pen:"+p);
		System.out.println("amount:"+Rs);
		System.out.println("bag:"+b);
	}
	public static void main(String[] args) {
		AccountOne u=new AccountOne();
		u.Name="bomb";
		u.b="berly";
		u.p="pen";
		u.Rs=152;
		u.netAccountOne();
		System.out.println("\n");

		u.Rs=25;
		u.netAccountOne();
		System.out.println("\n");

		u.Rs=50;
		u.netAccountOne();
		System.out.println(u.seeamount());
	}
}

