package InnerClass;

public class Static_Nested_InnerClass {
	private static String name = "data";
	private static double number = 20;

	public static class Innerclass {

		private String name1;

		public void display() {
			name1 = "baby";
			System.out.println("inner of the class name:" + name);
			System.out.println("out of the box:" + number);
			System.out.println(name1);

		}
	}

	public static void main(String[] args) {
		Static_Nested_InnerClass sn = new Static_Nested_InnerClass();
		Static_Nested_InnerClass.Innerclass in = new Static_Nested_InnerClass.Innerclass();
		in.display();
		System.out.println(sn.getClass());
	}

}