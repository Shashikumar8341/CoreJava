package com.java.EncapsulationConcepts;

public class Account {
	private int acno;
	private String acName;
	private double balance;
	public Account() {
	}
	public Account(int acno, String acName,double balance) {

		this.acName=acName;
		this.acno=acno;
		this.balance=balance;
	}

	public void deposit(double amount){
		if (amount <= 0) {
			System.out.println(" invalid amount, please deposit above  zero amount");
		}
		this.balance +=amount;
	}

	public double withDraw(double amount) {
		if (amount <= 0) {
			System.out.println(" invalid amount");
		}
		if (balance <= 0) {
		}
		balance = balance - amount;
		return balance;
	}

	public void balanceEnquiry() {
		System.out.println(this.balance);
	}

	public void setAcNo(int acno) {
		this.acno = acno;
	}


	public int getAcNo() {
		return acno;
	}

	public void setAcName(String name) {
		acName = name;
	}

	public String getAcName() {
		return this.acName;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [acno=" + acno + ", acName=" + acName + ", balance=" + balance + "]";
	}

	public static void main(String[] args) {
		Account account = new Account(12345, "anil", 10000.00);
		account.acno = 1123345;
		account.acName = "anil";
		account.balance = 10000.00;
		System.out.println(account.hashCode());
		System.out.println(account);

		System.out.println(account.getAcName() + "  " + account.getBalance());
		account.setAcName("anil b");
		System.out.println(account.getAcName() + "  " + account.getBalance());

	}

	public double getBalance() {
		return this.balance;
	}}
