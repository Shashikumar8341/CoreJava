package Arraylist_exmpls;

import java.util.ArrayList;
import java.util.List;

public class Addall_Arraylist {
/**
 * Add All Elements Of A List To Arraylist In Java
 * The addAll() method is used to add all elements of a list to arraylist in java.
 *@author shiva.netha
 */
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Jai");
		arrayList.add("Mahesh");
		arrayList.add("Vivek");
		arrayList.add("Naren");
		System.out.println(arrayList);

		List<String> list = new ArrayList<String>();
		list.add("Hemant");
		list.add("Vishal");
		System.out.println(list);
		list.addAll(arrayList);
		System.out.println(list);
	}
}
