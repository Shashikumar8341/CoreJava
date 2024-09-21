package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test_Building {
	public static void main(String[] args) {
		Set<Building> s = new HashSet<>();
		Building b = new Building(45, "laxmi", 25, 8);
		Building b2 = new Building(45, "laxmi", 25, 8);
		Building b3 = new Building(45, "laxmi", 25, 8);
		Building b4 = new Building(45, "laxmi", 25, 8);
		Building b5 = new Building(45, "laxmi", 25, 8);
		s.add(new Building(45, "laxmi", 25, 8));
		s.add(new Building(50, "chendu", 32, 6));
		s.add(new Building(65, "shashi", 16, 8));
		s.add(new Building(85, "baby", 12, 12));
		Iterator<Building> i = s.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		Iterator<Building> ib = s.iterator();
		for (Building building : s) {
			if (building.getName().startsWith("l")) {
				System.out.println(building);

			}
		}
	}
}
