package ArrayList;

import java.util.*;

public class GroupOfElements {
	public static void main(String[] args) {
		ArrayList <Object>al = new ArrayList<>();
		al.add("shashi");
		al.add("sony");
		System.out.println(al);
		ArrayList<Integer> ai = new ArrayList<>();
		ai.add( 1);
		ai.add(250);
		System.out.println(ai);
		ArrayList<Object> aL = new ArrayList<>();
		aL.add(8341866042L);
		aL.add(2566528261L);
		System.out.println(aL);
		aL.addAll(al);
		System.out.println(aL);
		TreeSet <Object> st=new TreeSet();
		st.add(125);
		st.add(45);
		st.add(25);
		st.add(5);
		st.add(5550);
		System.out.println(st);
		st.addAll(ai);
		System.out.println(st);
		st.remove(1);
		System.out.println(st);
		al.add(0, "kumar");
		System.out.println(al);
		al.clear();
		System.out.println(al);
		aL.clone();
		System.out.println(aL);
		ai.containsAll(al);
		ai.set(0, 2512);
		System.out.println(ai.get(0));
		System.out.println(ai);
		al.size();
		System.out.println(al.size());
		al.lastIndexOf(1);
		System.out.println(al);
		Object[]arr=al.toArray();
		System.out.println(Arrays.toString(arr));


	}
}
