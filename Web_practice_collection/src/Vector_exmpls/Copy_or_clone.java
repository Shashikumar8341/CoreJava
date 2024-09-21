package Vector_exmpls;

import java.util.Vector;

public class Copy_or_clone {
	/*
	 * Copy Or Clone A Vector In Java
	 * @author shashi
	 */
	public static void main(String[] args) {
		Vector<String>v=new Vector<>();
		v.add("malesh");
		v.add("bhimesh");
		v.add("lokesh");
		v.add("harish");
		v.add("shidesh");
		v.add("kamesh");
	System.out.println(v.clone());
	System.out.println(v);
	Vector<String>copy=(Vector<String>) v.clone();
	System.out.println(copy);
	}
}
