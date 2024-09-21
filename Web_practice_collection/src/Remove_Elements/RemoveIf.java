package Remove_Elements;

import java.util.*;

import javax.xml.stream.events.StartElement;

public class RemoveIf {

	/**
	 * Removing collection elements using Collection.removeIf()
	 * @author shashi
	 */
	public static void main(String[] args) {
		List<String>s=new ArrayList<>();
		s.add("Tiger");  
		s.add("Lion");  
		s.add("Dog");  
		s.add("Elephant");
		System.out.println(s);
		s.removeIf(e -> e.startsWith("S"));	
		Iterator<String>i=s.iterator();
		for (String string : s) {
			System.out.println(string.startsWith("D"));	
		}
}
}
