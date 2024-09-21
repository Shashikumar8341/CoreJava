package Vector_exmpls;

import java.util.Vector;

public class Sub_List {
/**
 * Get Sub List From Vector In Java
 * The subList() method is used to get sub list from vector in java.
 * @author shiva.netha
 */
	public static void main(String[] args) {
		Vector<String>vector=new Vector<>();
		vector.add("Tiger");  
		vector.add("Lion");  
		vector.add("Dog");  
		vector.add("Elephant");
		System.out.println(vector);
		System.out.println(vector.subList(1, 4));
	}
}
