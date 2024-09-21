package Set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test_M {
	public static void main(String[] args) {
		Set<Mobile>s=new TreeSet<>();
		s.add(new Mobile(834186042L, "sony", 45));
		s.add(new Mobile(834186042L, "iphone", 45));
		s.add(new Mobile(834186042L, "oppo", 45));
		Iterator<Mobile> i=s.iterator();
		while (i.hasNext()) {
			Mobile mobile = (Mobile) i.next();
			System.out.println(mobile);
		}
		Iterator<Mobile> im=s.iterator();
		for (Mobile mobile : s) {
			System.out.println(mobile.getName().startsWith("s"));
		}
	}
}
