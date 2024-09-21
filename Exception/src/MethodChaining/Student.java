package MethodChaining;

public class Student {

	private String name;  
	private int id;      
	private int age;  
	private int std;  
	
	public Student setName(String name)   
	{  
		this.name = name;  
		return this;  
	}  
	public Student setId(int id)   
	{  
		this.id = id;  
		return this;  
	}  
	public Student setAge(int age)   
	{  
		this.age = age;  
		return this;  
	}  
	public Student setStd(int std)   
	{  
		this.std = std;  
		return this;  
	}  
	public void detail()   
	{  
		System.out.println("Student Detail is");  
		System.out.println("\nName: "+name+"\nId: "+id+ "\nAge: "+age+ "\nStandard: "+std);  
	}  
	public static void main(String args[])   
	{  
		Student student = new Student();  
		student.setName("shashikumar").setId(1183).setAge(17).setStd(9).detail();  
	}  
}  

