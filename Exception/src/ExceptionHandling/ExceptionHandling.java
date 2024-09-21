package ExceptionHandling;

public class ExceptionHandling {
	private String name;
	private int number;

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
//	int a=50/0;
	public static void main(String[] args) {
		ExceptionHandling E=new ExceptionHandling();	
		E.setName("Asus");
		E.setNumber(5);
		System.out.println(E.getName().getClass().getModifiers());
//		System.err.println(E.a);	
	}

}
