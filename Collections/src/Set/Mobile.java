package Set;

public class Mobile implements Comparable<Mobile> {
	private long ph_n;
	private String name;
	private int number;

	public Mobile(long ph_n, String name, int number) {
		super();
		this.ph_n = ph_n;
		this.name = name;
		this.number = number;
	}

	public long getPh_n() {
		return ph_n;
	}

	public void setPh_n(long ph_n) {
		this.ph_n = ph_n;
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
		return "Mobile [ph_n=" + ph_n + ", name=" + name + ", number=" + number + "]";
	}

	@Override
	public int compareTo(Mobile o) {
		return this.name.compareTo(o.name);
	}

}
