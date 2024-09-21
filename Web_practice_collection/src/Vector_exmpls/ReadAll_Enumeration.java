package Vector_exmpls;
import java.util.*;
public class ReadAll_Enumeration {

	/**
	 * Read all elements in vector using Enumeration
	 * @author shashi
	 */
	public static void main(String[] args) {
		Vector<String> vector=new Vector<>();
		vector.add("Jai");
		vector.add("Mahesh");
		vector.add("Hemant");
		vector.add("Vishal");
		Enumeration<String> Enumeration=vector.elements();
		while (Enumeration.hasMoreElements()) {
			String string = (String) Enumeration.nextElement();
			System.out.println(string);
			
		}
	}
}
