package Arraylist_exmpls;

import java.util.ArrayList;
import java.util.Collections;

public class Comparator_Test {
	public static void main(String[] args) {
		ArrayList<Comparator_Arraylist> a = new ArrayList<>();
		a.add(new Comparator_Arraylist("Jai", 50000));
		a.add(new Comparator_Arraylist("Mahesh", 80000));
		a.add(new Comparator_Arraylist("Vishal", 60000));
		a.add(new Comparator_Arraylist("Hemant", 64000));
		Collections.sort(a,new Comparator_Arraylist());
		for (Comparator_Arraylist comparator_Arraylist : a) {
			System.out.println(comparator_Arraylist);
		}
	}
}
