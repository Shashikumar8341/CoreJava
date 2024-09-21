package com.java.Methods;

public class MethodDemo {
		
		
		public void sayHello() {
			String name="ram";
			System.out.println("Hello....."+ name);
		}
		
		public void greetingMsg(String name) {
			System.out.println("Welcome....."+ name);
		}
		
		public void printFullName(String firstName, String lastName) {
			System.out.println("Full Name: "+firstName+" "+lastName);
		}
		
		public static void  main(String[] args) {
//			int i=1;
			
			System.out.println("hello....."+"charvy");
//			instance and object
			
			MethodDemo demo=new MethodDemo();// instance or object creation
			demo.sayHello();
			demo.sayHello();
			demo.sayHello();
			demo.sayHello();
			demo.sayHello();
			demo.greetingMsg("sita");
			demo.greetingMsg("laxman");
			demo.greetingMsg("rakesh");
			demo.greetingMsg("latha");
			demo.printFullName("sachin", "tendulkar");
			demo.printFullName("virat", "kohli");
			demo.printFullName("rohit", "sharma");
			demo.printFullName("ashwin", "ravi");
			
		}

	}


