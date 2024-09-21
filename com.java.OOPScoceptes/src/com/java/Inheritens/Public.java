package com.java.Inheritens;

public class Public extends Announcement {
	int MEMBERS;

	public int getMEMBERS() {
		return MEMBERS;
	}

	public Public(String name, int idnumber, double salary) {
		super(name, idnumber, salary);
	}

	public void setMEMBERS(int MEMBERS) {
		MEMBERS = MEMBERS;
	}

	public Public(int MEMBERS) {
		super();
		MEMBERS = MEMBERS;
	}

	public Public() {
		super();
	}

	public static void main(String[] args) {

		Public p = new Public();
		p.MEMBERS = 165;
		p.airplane = "indigo";
		p.countryCode = +91;
		p.passportNumber = 0432565L;
		p.name = "saipallavi";
		p.idnumber = 165;
		System.out.println(p.name+" ,"+	p.idnumber);
	}

}
