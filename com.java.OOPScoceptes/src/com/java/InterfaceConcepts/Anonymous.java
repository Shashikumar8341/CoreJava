package com.java.InterfaceConcepts;

public abstract class Anonymous {
abstract void eat() ;
String name;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
/**
 * @param name
 */
public Anonymous(String name) {
	super();
	this.name = name;
}
	

}
