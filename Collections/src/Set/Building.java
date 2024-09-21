package Set;

import java.util.Iterator;
import java.util.Set;

public class Building {
	private int area;
	private String name;
	private int rad;
	private int rooms;

	public Building(int area, String name, int rad, int rooms) {
		super();
		this.area = area;
		this.name = name;
		this.rad = rad;
		this.rooms = rooms;
	}

	public int getArea() {
		return area;
	}

	public String getName() {
		return name;
	}

	public int getRad() {
		return rad;
	}

	public int getRooms() {
		return rooms;
	}

	@Override
	public String toString() {
		return "Building [area=" + area + ", name=" + name + ", rad=" + rad + ", rooms=" + rooms + "]";
	}

	public boolean hashCode(Set<Building> s) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

}
