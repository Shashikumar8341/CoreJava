package Arraylist_exmpls;

import java.util.ArrayList;
import java.util.Collections;

public class Revers {
/**
 * Reverse Contents Of Arraylist In Java
 * We can use Collections.reverse() method to reverse contents of arraylist in java.
 *@author shiva.netha
 */
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Jai");
		arrayList.add("Mahesh");
		arrayList.add("Vivek");
		arrayList.add("Naren");
		System.out.println(arrayList);
		Collections.reverse(arrayList);
		System.out.println(arrayList);
	}
}
