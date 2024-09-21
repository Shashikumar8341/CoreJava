package InnerClass;

public class Member_InnerClass {
	String name;
	int number;

	/**
	 * @param name
	 * @param number
	 */
	public Member_InnerClass(String name, int number) {
		super();
		this.name = name;
		this.number = number;
	}
	class member {
		private void name1() {
			final int Number=50;
			System.out.println("in case of private it can use Member_InnerClass only");
		System.out.println(Number);
		}
	}
	public static void main(String[] args) {
		Member_InnerClass mi=new Member_InnerClass("IQ", 19);
		System.out.println(mi.number);
		Member_InnerClass.member mm=mi.new member();
		mm.name1();
		
	}
}
