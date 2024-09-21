package Linkedlist_exmpls;

import java.util.Iterator;
import java.util.LinkedList;

public class Readall {
/**
 * Read All Elements In Linkedlist In Java
 * hasNext(): It returns true if the iteration has more elements. next(): It returns the next element in the iteration.
 * @author shiva.netha
 */
public static void main(String[] args) {
	LinkedList<String> linkedList = new LinkedList<String>();
	linkedList.add("Jai");
	linkedList.add("Mahesh");
	linkedList.add("Naren");
	linkedList.add("Vivek");
	linkedList.add("Vishal");
	linkedList.add("Hemant");
	System.out.println(linkedList);
	Iterator<String>i=linkedList.iterator();
	while (i.hasNext()) {
		String string = (String) i.next();
		System.out.println(string);
	}
}}
