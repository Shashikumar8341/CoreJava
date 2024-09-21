package com.java.Inheritens;

public interface Multiple{
public default   void name1() {
	System.out.println("multiple inheritance is not supported because of ambiguity problem.");
}
}
