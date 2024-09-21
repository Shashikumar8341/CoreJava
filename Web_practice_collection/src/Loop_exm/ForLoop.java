package Loop_exm;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class ForLoop {
	/**
	 * Iterate collection objects using forEach Method with Lambda Expressions
	 *
	 */
	public static void main(String[] args) {
		List<Long> l = new Vector<Long>();
		l.add(8341l);
		l.add(866042l);
		l.add(99590l);
		l.add(55215l);
		l.add(88973l);
		l.add(32411l);
//		Iterator<Long>i=l.iterator();
//		for (Long long1 : l) {
//			System.out.println(long1);
			l.forEach(Long->System.out.println(l));
			l.forEach(s->System.out.println(s));//lambda Expressions
		}
	}

