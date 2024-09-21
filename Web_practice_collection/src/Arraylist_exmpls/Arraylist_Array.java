package Arraylist_exmpls;

import java.util.ArrayList;

public class Arraylist_Array {
	/**
	 * Arraylist To Array In Java
	 * The toArray() method is used to convert arraylist to array in java.
	 * @author shiva.netha
	 */
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Jai");
		arrayList.add("Mahesh");
		arrayList.add("Vivek");
		arrayList.add("Naren");
		System.out.println(arrayList);
		String[]s=new String[arrayList.size()];
		arrayList.toArray(s);
		for (String string : s) {
			System.out.println(string);
		}
	}
}