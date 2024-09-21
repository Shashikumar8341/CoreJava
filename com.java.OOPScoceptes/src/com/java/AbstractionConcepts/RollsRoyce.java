package com.java.AbstractionConcepts;

public abstract class RollsRoyce 
{
	String Headquarters;
	int Founded;
	int Employees;
	String Parentorganization;
	public RollsRoyce(String headquarters, int founded, int employees, String parentorganization) {
		super();
		this.Headquarters = headquarters;
		this.Founded = founded;
		this.Employees = employees;
		this.Parentorganization = parentorganization;
	}
	public String getHeadquarters() 
	{
		return Headquarters;
	}
	public void setHeadquarters(String getHeadquarters) 
	{
		this.Headquarters=getHeadquarters;
	}
	public int getFounded() 
	{
		return Founded;
	}
	public void setFounded(int Founded) 
	{
		this.Founded=getFounded();
	}
	public int getEmployees() 
	{
		return Employees;
	}
	public void  setEmployees(int Employees) 
	{
		this. Employees=getEmployees();
	}
	public String getParentorganization() 
	{
		return  Parentorganization;
	}
	public void setParentorganization(String Parentorganization) 
	{
		this.Parentorganization=getParentorganization();
	}
	public abstract void RollsRoyce();
}
