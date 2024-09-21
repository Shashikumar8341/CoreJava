package InnerClass;

public class Local_InnerClass {
	private String name;
	private double amount;
	private int number;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void name() {
		class localinnerclass {
			private int innerData = 5;

			public int getInnerData() {
				return innerData;
			}

			public void dispaly() {
				System.out.println("if innerclass:" + innerData);

			}
		}
		localinnerclass lin = new localinnerclass();
		lin.dispaly();
		System.out.println(lin.getInnerData());
	}

	public static void main(String[] args) {
		Local_InnerClass li = new Local_InnerClass();
		li.setAmount(2500.00);
		li.setName("in case of that");
		li.setNumber(19);
		System.out.println(li.getAmount());
		System.out.println(li.getName());
		System.out.println(li.getNumber());
		li.name();
	
	}
}
