package Vector_exmpls;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class AddTo_Vector_List {
	/**
	 * Add All Elements Of A List To Vector In Java
	 * 
	 * @author shiva.netha
	 */
	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		v.add("malesh");
		v.add("bhimesh");
		v.add("lokesh");
		v.add("harish");
		v.add("shidesh");
		v.add("kamesh");
		System.out.println(v);
		List<String> list = new ArrayList<>();
		list.add("Jai");
		list.add("Mahesh");
		list.add("Hemant");
		list.add("Vishal");
		System.out.println(list);
		//		list.addAll(v);
		list.addAll(1, v);
		System.out.println(list);
	}
}
