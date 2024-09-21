package Remove_Elements;

import java.util.*;

public class RemoveElements {
	/**
	 * Removing collection elements using Iterator
	 * 
	 * @SHASHI
	 */
	public static void main(String[] args) {
		String Removingelement="akhila";
		List<String> m = new Stack<>();
		m.add("shiva");
		m.add("akhila");
		m.add("shashi");
		m.add("kumar");
		m.add("darling");
		m.add("baby");
		System.out.println(m);
		Iterator<String> i = m.iterator();
		while (i.hasNext()) {
			if (m.remove(Removingelement)) {
				System.out.println(m);

			}
			if (m.remove("shashi")) {
				System.err.println(m);
			}

		}
		while (i.hasNext()) {
			if (Removingelement.equals(i.next())) {
				i.remove();
				System.out.println(m);
			}
		}
	}
}
