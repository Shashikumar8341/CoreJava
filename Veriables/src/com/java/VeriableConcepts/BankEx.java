package com.java.VeriableConcepts;

public class BankEx {
	String bankName;
	long accountNumber;
	int yieldYear;
	short ifscNumber;
	String address;

	public void getBankEx() {
		System.out.println("bankName:" + bankName);
		System.out.println("accountNumber:" + accountNumber);
		System.out.println("yieldYear:" + yieldYear);
		System.out.println("ifscNumber:" + ifscNumber);
		System.out.println("address:" + address);
	}

	public static void main(String[] args) {
		BankEx set = new BankEx();
		set.accountNumber = 2356851535L;
		set.address = "ramagundam";
		set.bankName = "ntcp";
		set.ifscNumber = 23586;
		set.yieldYear = 2024;
		set.getBankEx();
	}

}
