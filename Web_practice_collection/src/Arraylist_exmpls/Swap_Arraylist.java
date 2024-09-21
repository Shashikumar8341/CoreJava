package Arraylist_exmpls;

import java.util.ArrayList;
import java.util.Collections;

public class Swap_Arraylist {
/**
 * We can use Collections.swap() method to swap two elements in an arraylist in java.
 *  We have to pass the indexes which we need to swap.
 *@author shiva.netha
 */
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Jai");
		arrayList.add("Mahesh");
		arrayList.add("Vivek");
		arrayList.add("Naren");
		System.out.println(arrayList);
		Collections.swap(arrayList, 1, 3);
		System.out.println(arrayList);

	}
}
