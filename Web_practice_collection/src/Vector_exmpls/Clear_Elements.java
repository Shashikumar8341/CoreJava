package Vector_exmpls;

import java.util.Vector;

public class Clear_Elements {
/**
 * Remove All Elements From Vector In Java
 * The clear() method is used to delete or remove all elements of a vector at one call in java.
 * @author shiva.netha
 */
	public static void main(String[] args) {
		Vector<String>vector=new Vector<>();
		vector.add("Tiger");  
		vector.add("Lion");  
		vector.add("Dog");  
		vector.add("Elephant");
		System.out.println(vector);
		System.out.println(vector.removeAll(vector));
		vector.clear();
		System.out.println(vector);

	}
}
