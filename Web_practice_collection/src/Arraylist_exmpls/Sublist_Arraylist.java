package Arraylist_exmpls;

import java.util.ArrayList;
import java.util.List;

public class Sublist_Arraylist {
/**
 * Get Sublist From Arraylist In Java
 * We can get sublist from arraylist using subList() method by passing the start and end index of the range.
 *@author shiva.netha
 */
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Jai");
		arrayList.add("Mahesh");
		arrayList.add("Vivek");
		arrayList.add("Naren");
		System.out.println(arrayList);
		arrayList.get(2);
		System.out.println(arrayList);
		arrayList.subList(1, 3);
		System.out.println(arrayList);
		List<String>l=arrayList.subList(1, 3);
		System.out.println(l);


	}
	
}
