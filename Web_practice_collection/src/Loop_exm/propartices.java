package Loop_exm;

import java.util.List;

import java.util.*;
public class propartices {
//Using Classic For Loop Collection Objects In Java
	public static void main(String[] args) {
		List<Object> l=new ArrayList<>();
		l.add("s");
		l.add("h");
		l.add("a");
		l.add("s");
		l.add("h");
		l.add("i");
		System.out.println(l);
		List<Object> ll=new LinkedList<>();
		ll.add(19.7);
		ll.addAll(l);
		System.out.println(ll);
		for (int i = 0; i < l.size(); i++) {
			System.out.println(i);
			System.out.println(l.get(i));
		}
	}
}
