package com.java.AbstractionConcepts;

public abstract class SonyXperia extends Mobile {
	public abstract void delivery();

	public void body() {
		System.out.println("SonyXperia is metalbody");
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
//	public static void main(String[] args) {
//		SonyXperia sx = new SonyXperia();
//		sx.typesofmobile();
//		sx.body();
//		sx.brandname();
//		sx.colors();
//		sx.price();
//		sx.brandname();
//	}

}
