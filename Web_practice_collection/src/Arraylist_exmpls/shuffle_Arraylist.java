package Arraylist_exmpls;

import java.util.ArrayList;
import java.util.Collections;

public class shuffle_Arraylist {
	/**
	 * We can use shuffle() method which generates different order of output,
	 *  to shuffle elements in an arraylist in java.
	 * @param shashi
	 */
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Jai");
		arrayList.add("Mahesh");
		arrayList.add("Vivek");
		arrayList.add("Naren");
		System.out.println(arrayList);
		Collections.shuffle(arrayList);
		System.out.println(arrayList);

	}
}
