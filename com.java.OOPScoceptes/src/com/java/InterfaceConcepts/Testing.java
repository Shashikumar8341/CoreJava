package com.java.InterfaceConcepts;

public class Testing implements Bikecycle {

	@Override
	public void Intakestroke() {
		System.out.println();
	}

	@Override
	public void Compressionstroke() {
		System.out.println();
	}

	@Override
	public void Combustionstroke() {
		System.out.println();

	}

	@Override
	public void Exhauststroke() {
		System.out.println();

	}

	@Override
	public void riding(double price) {
		System.out.println("riding price: " + price);
	}

	public static void main(String[] args) {
		Testing t = new Testing();
		t.riding(20.00);
	}
}
