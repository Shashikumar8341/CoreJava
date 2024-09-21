package Remove_Elements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class String_Lenght {
	/**
	 * how to findout lenght of the string in a list. find max lenght of string
	 * 
	 * @author shiva.netha
	 */
	
	public static void main(String[] args) {
		
		List<String>m=new ArrayList<>();
		m.add("darling");
		m.add("shiva");
		m.add("akhila");
		m.add("shashi");
		m.add("kumar");
		m.add("baby");
		
		Iterator<String> i = m.iterator();
		while (i.hasNext()) {
			String string = (String) i.next();
			System.out.println(string);
		}
		for (String str : m) {
			int length = str.length();
			System.out.println("Length of "+ +length);
		}
		String max = Collections.max(m);
		System.out.println(max);
	}
}
