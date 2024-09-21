package com.java.Inheritens;

public class Airport {
	 String airplane;
	 long passportNumber;
	 int countryCode;
	 public Airport(){
		 
	 }

	public Airport(String airplane, long passportNumber, int countryCode) {// parameter constructor
		this.airplane = airplane;
		this.countryCode = countryCode;
		this.passportNumber = passportNumber;
	}

	public String getairplane() {
		return this.airplane;
	}
	public void setairplane(String getairplane) {
		this.setairplane(getairplane);
	}

	public int getcountryCode() {
		return this.countryCode;
	}

	public long getg0487474D() {
		return this.passportNumber;
	}
	

//	public static void main(String[] args) {
//		System.out.println("name:"+"baby");}//access modifier
//
//	}
//		Airport ind = new Airport(airplane, passportNumber, countryCode);
//		ind.getairplane();
//		System.out.println(airplane="indigo");
//		System.out.println(countryCode=+91);
//		System.out.println(passportNumber= 0432565L);

}
