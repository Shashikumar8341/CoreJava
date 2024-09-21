package com.java.InterfaceConcepts;

public  class Car {
public static void main(String[] args) {
	Engine 	Engine=new Engine() {
		
		@Override
		public void Intakestroke() {
		System.out.println("Intakestroke:the cycle of an internal-combustion engine during which "
				+ "the fuel mixture is drawn in before compression.");	
		}
		
		@Override
		public void Exhauststroke() {
			System.out.println("Exhauststroke:the movement of an engine piston.");	

		}
		
		@Override
		public void Compressionstroke() {
			System.out.println("Compressionstroke:the second of the four stages in a four-stroke engine.");	

		}
		
		@Override
		public void Combustionstroke() {
			System.out.println("Combustionstroke:where the ignited air-fuel mixture expands and pushes the piston downwards.");	

		}
	};
	Engine.Combustionstroke();
	Engine.Compressionstroke();
	Engine.Intakestroke();
	Engine.Exhauststroke();
	Engine.equals(Engine);}
}
