package com.java.InterfaceConcepts;

public class Drivers extends Airplane {
	
	public String Driver(String Driver) {
		return Driver;
	}

	@Override
	public void airplanceMoment() {
		super.airplanceMoment();
		System.out.println();
	}

	@Override
	public void primarycControlSurface() {
		super.primarycControlSurface();
		System.out.println();
	}

	public static void main(String[] args) {
		Drivers ds = new Drivers();
		ds.airplanceMoment();
		ds.primarycControlSurface();
		System.out.println(ds.Driver("panther"));
		System.out.println("Airplane:"+ds.a); 
	}
}
