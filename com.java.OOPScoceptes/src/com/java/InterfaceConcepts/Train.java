package com.java.InterfaceConcepts;

public class Train implements Engine,Bikecycle{

	@Override
	public void Intakestroke() {
		System.out.println("Train:the cycle of an internal-combustion engine during which "
				+ "the fuel mixture is drawn in before compression.");	
	}
	@Override
	public void Compressionstroke() {
		System.out.println("Train:the second of the four stages in a four-stroke engine.");	

	}
	@Override
	public void Combustionstroke() {
		System.out.println("Train:where the ignited air-fuel mixture expands and pushes the piston downwards.");
	}
	@Override
	public void riding(double price) {
		System.out.println("riding price: " + price);
	}
	@Override
	public void Exhauststroke() {
		System.out.println("Train:the movement of an engine piston.");	
	}

	public int trainSpeed() {
		int trainSpeed = (201);
		return trainSpeed;
	}
	public void steamengine() {
		System.out.println("Train:steam engine pressure (200-300 PSI).");
	}
	public static void main(String[] args) {
		Train train=new Train();
		train.Combustionstroke();
		train.Compressionstroke();
		train.Exhauststroke();
		train.Intakestroke();
		train.steamengine();
		train.riding(25);
		System.out.println(train.trainSpeed());
	}

}
