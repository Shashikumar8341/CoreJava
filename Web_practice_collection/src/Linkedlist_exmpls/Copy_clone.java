package Linkedlist_exmpls;

import java.util.LinkedList;

public class Copy_clone {
/**
 * Copy Or Clone Linked List In Java
 * We can use clone() method to copy or clone linked list in java
 *@author shiva.netha
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
		LinkedList<String>cpoy=(LinkedList<String>) linkedList.clone();
		for (String string : cpoy) {
			System.out.println(string);
		}
		
	}
}
