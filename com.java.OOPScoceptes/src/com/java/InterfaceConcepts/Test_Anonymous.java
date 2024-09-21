package com.java.InterfaceConcepts;

public class Test_Anonymous extends Anonymous{


	
	public Test_Anonymous(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	void eat() {
		
	}
	
public static void main(String[] args) {
	Test_Anonymous ta=new Test_Anonymous("bottle");
//	ta.setName("bottle");
	System.out.println(ta.getName());
}
}
