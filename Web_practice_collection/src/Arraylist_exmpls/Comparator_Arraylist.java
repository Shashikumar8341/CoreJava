package Arraylist_exmpls;

import java.util.Comparator;
import java.util.Objects;

public class Comparator_Arraylist implements Comparator<Comparator_Arraylist>{
	/**
	 * Short Arraylist Using Comparator In Java We can use Collections.sort() method
	 * to sort arraylist using comparator in java. We have to pass Comparator object
	 * in it.
	 * 
	 * @author shiva.netha
	 */
	private String name;
	private int number;

	public Comparator_Arraylist(String name, int number) {
		super();
		this.name = name;
		this.number = number;

	}

	public Comparator_Arraylist() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Comparator_Arraylist [name=" + name + ", number=" + number + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, number);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comparator_Arraylist other = (Comparator_Arraylist) obj;
		return Objects.equals(name, other.name) && number == other.number;
	}

	@Override
	public int compare(Comparator_Arraylist ca, Comparator_Arraylist caa) {
		if (ca.getNumber()<caa.getNumber()) {
			return 1;
		} else {
			return -1;
		}
	}

}
