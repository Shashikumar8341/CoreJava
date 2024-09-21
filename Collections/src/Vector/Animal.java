package Vector;

import java.util.Vector;

public class Animal {
	public static void main(String[] args) {

		Vector<String> vec=new Vector<>();
		vec.add("Tiger");  
		vec.add("Lion");  
		vec.add("Dog");  
		vec.add("Elephant");
		System.out.println(vec);
		System.out.println(vec.size());
		System.out.println(vec.capacity());
		vec.addElement("Rat");
		vec.addElement("cat");
		vec.addElement("Deer");
		System.out.println(vec);
		System.out.println("size is increase:"+vec.size());
		System.out.println(vec.capacity());
		if (vec.contains("cat")) {
			System.out.println(vec.indexOf("cat"));
		}
		System.out.println(vec.lastElement());
		System.out.println(vec.firstElement());
		for (String string : vec) {
			if (string.equals("cat")) {
				System.out.println(string);
			}
		}
		for (String stg : vec) {
			System.out.println("A to Z:"+stg);
		}
		String st=vec.toString();
		System.out.println(st);
	
	}
		
}