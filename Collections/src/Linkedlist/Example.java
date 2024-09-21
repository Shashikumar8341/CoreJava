package Linkedlist;

public class Example {
	int run;
	String varchar;

	public Example() {
		super();
	}

	public Example(int run, String varchar) {
		super();
		this.run = run;
		this.varchar = varchar;
	}

	public int getRun() {
		return run;
	}

	public void setRun(int run) {
		this.run = run;
	}

	public String getVarchar() {
		return varchar;
	}

	public void setVarchar(String varchar) {
		this.varchar = varchar;
	}

	@Override
	public String toString() {
		return "Example [run=" + run + ", varchar=" + varchar + "]";
	}
public static void main(String[] args) {
	Example e=new Example();
	e.setRun(15);
	e.setVarchar(null);
	System.out.println(e.getRun()+""+""+e.getVarchar());
	try {
		System.out.println(e.clone());
	} catch (CloneNotSupportedException e1) {
		e1.printStackTrace();
	}
}
}