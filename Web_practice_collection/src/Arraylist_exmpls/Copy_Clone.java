package Arraylist_exmpls;

import java.util.ArrayList;

public class Copy_Clone {
/**
 * Copy Or Clone A Arraylist In Java
 * The clone() method is used to copy or clone a arraylist in java.
 *@author shiva.netha
 */
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("shashi");
		al.add("sony");
		al.add("shiva");
		al.add("akhila");
		al.add("chandraiah");
		al.add("laxmi");
		ArrayList<String>copy=(ArrayList<String>) al.clone();
		for (String string : copy) {
			System.out.println(string);
		}
	}
}
