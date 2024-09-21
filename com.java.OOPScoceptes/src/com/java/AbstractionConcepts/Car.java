package com.java.AbstractionConcepts;

public class Car extends RollsRoyce {
	String RollsRoyceCeo;
	@Override
	public void RollsRoyce() {		
	}

	public Car(String headquarters, int founded, int employees, String parentorganization,String RollsRoyceCeo) {
		super(headquarters, founded, employees, parentorganization);
	}

	public void getRollsRoyceCeo() {
		System.out.println("RollsRoyceCeo:"+"Müller-Ötvös");
	}
	public static void main(String[] args) {
		Car cr=new Car("Goodwood plant", 1998, 13000, "BMW", " Müller-Ötvös");
		cr.getRollsRoyceCeo();
//		cr.setHeadquarters("Goodwood plant");
//		cr.setFounded(1998);
//		cr.setEmployees(13000);
//		cr.setParentorganization("BMW");
		System.out.println();
		System.out.println(cr.getHeadquarters()+" "+cr.getFounded()+" "+
				" "+cr.getEmployees()+" "+cr.getParentorganization());
	}

}
