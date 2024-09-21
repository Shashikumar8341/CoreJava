package com.java.VeriableConcepts;

public class Doctor {
	String Name;
	int id;
	String gmail;
	double salary;

	public void puls(double amount) {
		if (amount <= 20000) {
			salary = salary - amount;
		}
	}

	public void getdetails() {
		System.out.println("Name:" + Name);
		System.out.println("id:" + id);
		System.out.println("gmail:" + gmail);
		System.out.println("salary:" + salary);
	}

	public static void main(String[] args) {
		Doctor set = new Doctor();
		set.gmail = "hsdsjd@.com";
		set.Name = "manju";
		set.id = 19;
		set.salary = 150000D;
		set.getdetails();
		System.out.println("\n");
		set.salary = 20000;
		set.getdetails();
	}
}
