package ArrayList;

public class mobile_Name {
	private String name;
	private double amount;
	private int sizeinch;
	private String process;
	private int battery;

	public mobile_Name(String name, double amount, int sizeinch, String process, int battery) {
		super();
		this.name = name;
		this.amount = amount;
		this.sizeinch = sizeinch;
		this.process = process;
		this.battery = battery;
	}

	public String getName() {
		return name;
	}

	public double getamount() {
		return amount;
	}

	public int getSize() {
		return sizeinch;
	}

	public String getProcess() {
		return process;
	}

	public int getBattery() {
		return battery;
	}

	@Override
	public String toString() {
		return "moblie_Name [name=" + name + ", amount=" + amount + ", size=" + sizeinch + ", process=" + process + ", battery="
				+ battery + "]";
	}


}
