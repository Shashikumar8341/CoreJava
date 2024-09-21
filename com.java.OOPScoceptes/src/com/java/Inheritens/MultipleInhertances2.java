package com.java.Inheritens;

public class MultipleInhertances2 implements Multiple,Multiple1{

//	public class MultipleInhertances2 extends MultipleInheritance,MultipleInheritance1{
//		System.out.println("multiple inheritance is not supported because of ambiguity problem.");

	@Override
	public void name() {
		Multiple1.super.name();
	}
	@Override
	public void name1() {
		Multiple.super.name1();
	}
	public static void main(String args[]){
		MultipleInhertances2 obj = new MultipleInhertances2();
		//Ambiguity problem in method call which class name() method will be called.
		obj.name();
	}
}
