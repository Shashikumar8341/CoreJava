package com.java.VeriableConcepts;

public class AccountEx {
	// global variable
	String BranchManager;
	String AccountHolder;
	long anum;
	double balance;
	//	double withdraw;

	public void deposit(double amount) {
		if (balance<=0);
		//		System.out.println("invaild account, please the above one balance");
		balance+=amount;
	}
	public double getbalances() {
		return balance;
	}
	public double withdraw(double amount) {
		if (amount<=0) {
			System.out.println("invaild balance");
		}
		if (balance<=0) {
			System.out.println("insufficient funds");
		}
		balance=balance-amount;
		return balance;

	}

	public void netdetails() {
		// instance variable
		System.out.println("BranchManager:" + BranchManager);
		System.out.println("AccountHolder:" + AccountHolder);
		System.out.println("accountNumber:" + anum);
		System.out.println("balance:" + balance);
	}

	public static void main(String[] args) {
		AccountEx baby = new AccountEx();
		{
			baby.AccountHolder = "shashikuma";
			baby.BranchManager = "sony";
			baby.anum = 623456891568L;
			baby.balance = 35000.00D;	
			baby.netdetails();
		}
		System.out.println("\n");
		//		deposit amount
		baby.deposit(1200);
		baby.netdetails();
		System.out.println("\n");
		//withdraw
		baby.withdraw(11455);
		baby.netdetails();
	}
}