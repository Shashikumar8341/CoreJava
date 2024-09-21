package com.java.AbstractionConcepts;

public class SonyMobile extends SonyXperia {

	
	public void delivery() {
System.out.println("sony is most pacific product it carefull delivery");		
	}

	@Override
	public void inches() {
		System.out.println("sony mobiles 16.2 inches");
	}

	@Override
	public void typesofmobile() {
		System.out.println("Sony  It Can Introduce The So Many Typesmobiles");
	}

	@Override
	public void brandname() {
		System.out.println("It Was SonyXperia");
	}

	@Override
	public void price() {
		System.out.println("Price Of Sony 150000.00");
	}

	@Override
	public void colors() {
		System.out.println("Sony Mobile It Can Introduce The So Many Types Of Colors");
	}
	public static void main(String[] args) {
		SonyMobile sm = new SonyMobile();
		sm.typesofmobile();
		sm.body();
		sm.brandname();
		sm.colors();
		sm.price();
		sm.brandname();
		sm.delivery();
	}

}
