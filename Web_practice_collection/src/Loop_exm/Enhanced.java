package Loop_exm;
import java.util.*;
public class Enhanced {
	/**
	 * Iterate collection objects using Enhanced For Loop
	 * 
	 */
	public static void main(String[] args) {
		Set<Object> ss=new LinkedHashSet<>();	
		ss.add("shashi");
		ss.add("Ramagundam");
		ss.add(505208);
		ss.add(3-4-36/3);
		ss.add("peddapalli");
		ss.add("Telangana");
			
		for (Object string : ss) {
			System.out.println(string);
		}
//		for (Iterator it = ((Set) ss).iterator(); it.hasNext();) {
//			Object object = (Object) it.next();
//			System.out.println(object);
//		}

	}
}
