package Vector_exmpls;

import java.util.*;

public class ReadAll {
	/**
	* Read all elements in vector using iterator
	* @author w3spoint
	*/
	public static void main(String[] args) {
		Vector<String>l=new Vector<>();
		l.add("balaji");
		l.add("srikanth");
		l.add("sarika");
		l.add("ganesh");
		l.add("radhakrishna");
		l.add("surya");
		Iterator<String> iterator=l.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
			
		}
	}
}
