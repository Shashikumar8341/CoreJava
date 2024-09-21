package CustomExceptionHandling;

public class Test_customException {
	public static void main(String[] args) {
		try {
			throw new customException("the new file exception");

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
