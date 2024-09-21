package Vector;

import java.util.Enumeration;
import java.util.Vector;

import javax.lang.model.element.Element;

public class Vector_Demo {
	public static void main(String[] args) {
		int number =10;
		Vector<Integer> v=new Vector<>();

		for (int i = 0; i < number; i++) {
			v.addElement(i);;
		}
		System.out.println(v);
		Enumeration<Integer> e=v.elements();
		while (e.hasMoreElements()) {
			Integer i=(Integer)e.nextElement();
			if (i%2==0) {
				System.out.println(i);
			}
			System.out.println(v);		
		}
	}
}
