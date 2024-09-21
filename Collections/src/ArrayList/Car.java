package ArrayList;

import java.util.LinkedList;

public class Car {
	public static void main(String[] args) {
		LinkedList<Object> lst=new LinkedList<>();
		lst.add("car");
		lst.add("engine");
		lst.add("car");

		LinkedList<Object> lst2=new LinkedList<>();
		lst2.add(2500500);
		lst2.add("engine");

		lst.set(0, lst2);
		System.out.println(lst.get(0));
		lst.addAll(lst2);
		System.out.println(lst);

	}
}
