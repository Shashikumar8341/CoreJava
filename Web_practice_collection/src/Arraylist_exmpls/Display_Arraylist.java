package Arraylist_exmpls;

import java.util.ArrayList;
import java.util.Iterator;

public class Display_Arraylist {
	/**
	 * Display Arraylist Values By Using Iterator In Java
	 * @param shashi
	 */
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("shashi");
		al.add("sony");
		System.out.println(al);
		Iterator<String> i = al.iterator();
		while (i.hasNext()) {
			String string = (String) i.next();
			System.out.print(string);
		}
	}
}
