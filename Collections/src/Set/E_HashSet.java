package Set;
import java.util.*;

public class E_HashSet {
public static void main(String[] args) {
	Set<Employe> es=new HashSet<Employe>();
//	Set<Employe> es=new TreeSet<Employe>();
	//Set<Employe> es=new TreeSet<Employe>(new NameBasedDESCComparator());
	Employe e1 = new Employe(1, "Balaji", 20000.00);
	Employe e2 = new Employe(2, "Ram", 20000.00);
	Employe e3 = new Employe(1, "Balaji", 20000.00);
	Employe e4 = new Employe(3, "Roy", 20000.00);
	Employe e5 = new Employe(1, "Balaji", 20000.00);
	es.add(e5);
	es.add(e4);
	es.add(e3);
	es.add(e2);
	es.add(e1);
	Iterator<Employe>ie=es.iterator();
	while (ie.hasNext()) {
		Employe employe = (Employe) ie.next();
		System.out.println(employe);
	}
	
}
}
