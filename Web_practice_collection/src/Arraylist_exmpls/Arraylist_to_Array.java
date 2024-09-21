package Arraylist_exmpls;

import java.util.ArrayList;
import java.util.Arrays;

public class Arraylist_to_Array {

	/**
	 * covert Arraylist to Array
	 */
	public static void main(String[] args) {
		int a[] = new int[4];
		a[0] = 10;
		a[1] = 20;
		a[2] = 70;
		a[3] = 40;
		System.out.println(a);
		ArrayList<Object>g=new ArrayList<>();
		g.add(12);
		g.add(12);
		g.add(12);
		g.add(12);
		g.add(12);
		g.addAll(g);
		System.out.println(g);
		Object[]o=g.toArray(new Object[g.size()]);
		for (Object object : o) {
			System.out.println(object);
		}
		
		
	}
}
