package com.java.VeriableConcepts;

public class AccountDemo {

	int acctNo;
	String name;
	double balance;
	final static String BRANCH_NAME = "SBI SR NAGAR BRANCH";

	public void getAccountDetails() {
		System.out.println("acct no: " + acctNo);
		System.out.println("Name: " + name);
		System.out.println("balance: " + balance);
		//		BRANCH_NAME="Ram branch";
		System.out.println("Branch Name: " + BRANCH_NAME);
	}	

	public void deposit(double amount) {
		if (amount <= 0) {
			System.out.println(" invalid amount, please deposit above  zero amount");

		}
		balance += amount;
	}

	public double getBalance() {
		return balance;
	}

	public double withDraw(double amount) {
		if (amount <= 0) {
			System.out.println(" invalid amount");
		}
		if (balance <= 0) {
			System.out.println(" insufficient funds");
		}
		balance = balance - amount;
		return balance;
	}

	public static void main(String[] args) {
		AccountDemo a1 = new AccountDemo();
		a1.acctNo = 1111;
		a1.name = "sita";
		a1.balance = 2000.00;

		a1.getAccountDetails();
		System.out.println("_____----------------------------");

		a1.deposit(12000);
		a1.getAccountDetails();
		System.out.println(a1.getBalance());
		System.out.println("_____----------------------------");

		a1.withDraw(5000);
		a1.getAccountDetails();
		
	}

}
