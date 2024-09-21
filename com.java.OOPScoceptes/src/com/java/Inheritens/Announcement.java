package com.java.Inheritens;

public class Announcement extends Airport{
	 String name;
	 int idnumber;
	 double salary;
	public Announcement() {
		super();
	}
	
	public Announcement(String name, int idnumber, double salary) {
		super();
		this.name = name;
		this.idnumber = idnumber;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIdnumber() {
		return idnumber;
	}

	public void setIdnumber(int idnumber) {
		this.idnumber = idnumber;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Announcement [name=" + name + ", idnumber=" + idnumber + ", salary=" + salary + "]";
	}
	
	
//	public static void main(String[] args) {
//		
//		Announcement anno=new Announcement(airplane, passportNumber, countryCode,
//				name,idnumber,salary);
//		
//		anno.getairplane();
//		System.out.println(airplane="indego");
//		System.out.println(countryCode=+91);
//		System.out.println(passportNumber= 0432565L);
//		System.out.println(name="saipallavi");
//		System.out.println(idnumber=165);
//		System.out.println(salary=35000.00);
//		
//	}
}
