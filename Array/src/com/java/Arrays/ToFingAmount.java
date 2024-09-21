package com.java.Arrays;

public class ToFingAmount {

	public static void main(String[] args) {
		double totalamount=20000.00;
		double notes[]= {2000,1000,500,100,50,20,10,5};
		double note=totalamount;
		for (int i = 0; i < notes.length; i++) {
			System.out.println("number of amount:"+notes[i]+"notes="+note/notes[i]);
			note=note%notes[i];
		}}

}
