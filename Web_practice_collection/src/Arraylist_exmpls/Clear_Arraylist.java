package Arraylist_exmpls;

import java.util.ArrayList;

public class Clear_Arraylist {
	/**
	 * Remove All Elements From Arraylist In Java
	 * The clear() method is used to remove all elements from arraylist in java.
	 *@author shiva.netha
	 */
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Jai");
		arrayList.add("Mahesh");
		arrayList.add("Vivek");
		arrayList.add("Naren");
		System.out.println(arrayList);
		arrayList.clear();
		System.out.println(arrayList);
		}

}

