package com.java.Inheritens;

public class HouesHoners extends Builders {
	String HouesHoner;
	int age;
	double salary;

	public HouesHoners(String lang, int rod, String cement, String name, double contractorAmount, int workMemebers,
			String HouesHoner, int age, double salary) {
		super(lang, rod, cement, name, contractorAmount, workMemebers);

		this.age = age;
		this.salary = salary;
		this.HouesHoner = HouesHoner;
	}

	public void getHouesHoner() {
		System.out.println("HouesHoner:" + "RadhaKrishna");
	}

	public void getsalary() {
		System.out.println("salary:" + 150000.01);
	}

	public void getage() {
		System.out.println("age:" + 45);
	}

	public static void main(String[] args) {
		HouesHoners hh = new HouesHoners("cocopeat", 16,"birla", "balaji", 45000.00, 25, "RadhaKrishna", 45,
				150000.01);
		System.out.println("name:" + hh.name);
		System.out.println("workMemebers:" + hh.workMemebers);
		System.out.println("contractorAmount:" + hh.contractorAmount);
		System.out.print("\n");
		System.out.println("lang:" + hh.lang);
		System.out.println("rod:" + hh.rod);
		System.out.println("cement:" + hh.cement);
		System.out.print("\n");
		hh.getHouesHoner();
		hh.getage();
		hh.getsalary();
	}
}
