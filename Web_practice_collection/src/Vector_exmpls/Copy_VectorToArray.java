package Vector_exmpls;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Copy_VectorToArray {
/**
 * Copy Vector To Array In Java
 * The copyInto() method is used to copy vector to array in java.
 * @author shiva.netha
 */
	public static void main(String[] args) {
		Vector<String>vector=new Vector<>();
		vector.add("Tiger");  
		vector.add("Lion");  
		vector.add("Dog");  
		vector.add("Elephant");
		System.out.println(vector);
		String[]s=new String[vector.size()];
		vector.copyInto(s);
		System.err.println("Copied Array content:");
		for (String string : s) {
			System.out.println(string);
		}
		

	}
}
