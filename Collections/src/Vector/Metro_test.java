package Vector;

import java.util.Iterator;
import java.util.Vector;

public class Metro_test {
	public static void main(String[] args) {
		Vector<metro_Train> v=new Vector<>();
		v.add(new metro_Train("bharath",12,8341866042L,"hyderabad","miyapur",25000.00));
		v.add(new metro_Train("jaipur",10,236852352L,"hyderabad","jaipur",45000.00));
		v.add(new metro_Train("vandhebharath",1,24863546845L,"hyderabad","tirupathi",85000.00));
		for (metro_Train object : v) {
			if (object.getTrain_number()>=12) {
				System.out.println(object);
			}
		}
		System.err.println("_____________________________");
		for (metro_Train object : v) {
			if (object.getEmpName().startsWith("b")) {
				System.out.println(object);
			}
		}
		System.err.println("_____________________________");

		Iterator<metro_Train> it=v.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());		
		}
		System.err.println("_____________________________");
		v.trimToSize();
		System.out.println("The elements of a vector are:");  
		for (metro_Train metro_Train : v) {
			System.out.println(metro_Train);
		}
		System.out.println("Size of the vector after trimToSize(): " +v.capacity());  
        System.out.println(".............");  

		System.out.println(v);


	}
}
