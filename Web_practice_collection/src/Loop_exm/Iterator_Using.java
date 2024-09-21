package Loop_exm;
import java.util.*;
public class Iterator_Using {
	/**
	 * Iterate collection objects using Iterator
	 * 
	 */	
		public static void main(String[] args) {
		Set<Integer> k=new HashSet<>();
		k.add(19);
		k.add(15);
		k.add(14);
		k.add(25);
		Iterator<Integer>i=k.iterator();
		while (i.hasNext()) {
			Integer integer = (Integer) i.next();
			System.out.println(integer);
		}
	}
}
