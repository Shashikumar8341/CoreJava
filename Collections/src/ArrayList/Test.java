package ArrayList;

import java.util.*;

public class Test {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();

		al.add(12);
		al.add(112);
//	al.add("rrr");
//	al.add(20l);
		al.set(0, 1565);
		al.add(125);
		al.add(128);
		al.add(129);
		al.add(25689);

		int big = 0;

		for (Integer integer : al) {
			if (integer > big) {
				big = integer;
				System.out.println(big);
			}

		}

//	for (Object object : al) {
//		if(big>object) {
//			
//		}
//		
//		System.out.println(object);
//	}

//	al.get(1);
//	TreeSet<String> st=new TreeSet<>();
//	st.toString();
//	st.add("baby");
//	st.addAll(52);
//	System.out.println(al.get(5));
//	System.out.println(al.addAll(0, al));
//	System.err.println(st.add("shashi"));```
//	System.out.println(st);

		ArrayList<Employe> listofemps = new ArrayList<>();
		listofemps.add(new Employe(10, "SURESH", 25000));
		listofemps.add(new Employe(20, "AAAA", 100000));
		listofemps.add(new Employe(30, "BBBB", 75000));
		listofemps.add(new Employe(80, "RRRR", 150000));
		listofemps.add(new Employe(5, "OOOO", 5000));
		
		for (Employe employe : listofemps) {
			if(employe.getEmpsalary()>75000) {
				System.out.println(employe);
			}
		}
	}
}
