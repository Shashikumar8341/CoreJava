package com.java.Arrays;

public class Constructors {
	String bulidingName;
	String bulidingStrength;
	int bulidingRooms;

	/**
	 * @param bulidingName
	 * @param bulidingStrength
	 * @param bulidingRooms
	 */
	public Constructors(String bulidingName, String bulidingStrength, int bulidingRooms) {
		super();
		this.bulidingName = bulidingName;
		this.bulidingStrength = bulidingStrength;
		this.bulidingRooms = bulidingRooms;
	}

	public String getBulidingName() {
		return bulidingName;
	}

	public void setBulidingName(String bulidingName) {
		this.bulidingName = bulidingName;
	}

	public String getBulidingStrength() {
		return bulidingStrength;
	}

	public void setBulidingStrength(String bulidingStrength) {
		this.bulidingStrength = bulidingStrength;
	}

	public int getBulidingRooms() {
		return bulidingRooms;
	}

	public void setBulidingRooms(int bulidingRooms) {
		this.bulidingRooms = bulidingRooms;
	}

	public void getdetails() {
		System.out.println(bulidingName);
		System.out.println(bulidingRooms);
		System.out.println(bulidingStrength);
	}

	public static void main(String[] args) {
		Constructors ct = new Constructors("laxminivas", "25years", 8);
		Constructors ct1 = new Constructors("royal", "20years", 10);
		Constructors ct2 = new Constructors("hometown", "35years", 5);
		Constructors ct3 = new Constructors("mahakali", "15years", 4);
		// ct.setBulidingName("laxminivas");
		// ct.setBulidingRooms(8);
		// ct.setBulidingStrength("25years");
		System.out.println(ct.getBulidingName());
		System.err.println(ct.getBulidingStrength());
		System.out.println(ct.getBulidingRooms());
		System.out.println("\n");
		Constructors[] constructors = { ct, ct1, ct2, ct3 };
		for (Constructors constructors2 : constructors) {
			constructors2.getdetails();
		}
		System.out.println("\n");
		String[] name = new String[4];
		name[0] = "a";
		name[1] = "b";
		name[2] = "c";
		name[3] = "d";
		for (int i = 0; i < name.length; i++) {
			System.err.println(name[i]);
		}
		System.out.println("\n");
		String[] names = { "a", "b", "c", "d" };
		for (String string : names) {
			System.out.println(string);
		}
		System.out.println("\n");
		int[] number = new int[4];
		number[0] = 8;
		number[1] = 10;
		number[2] = 5;
		number[3] = 4;
		for (int i = 0; i < number.length; i++) {//traditional elements
			System.err.println(number[i]);

		}
		System.out.println("\n");
		int[] numbers = { 8, 10, 5, 4 };
		for (int numbers1 : numbers) {
			System.out.println(numbers1);
		}
	}
}
