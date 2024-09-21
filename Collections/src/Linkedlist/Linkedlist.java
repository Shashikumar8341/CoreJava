package Linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {
	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<>();
		ll.add("Ravi");
		ll.add("kumar");
		System.out.println(ll);
		LinkedList<String> ls=new LinkedList<>();
		ls.add("srinu");
		ls.addAll(1, ll);
		System.out.println(ls);
		Iterator<String>is=ll.iterator();
		while (is.hasNext()) {
			System.out.println(is.next());	
		}
		System.err.println(2);
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
}
}
