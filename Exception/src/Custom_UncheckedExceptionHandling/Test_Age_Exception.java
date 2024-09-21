package Custom_UncheckedExceptionHandling;

public class Test_Age_Exception {
	public static void main(String[] args) {
	}
	static void valied(int age)throws Age_Exception{
		if (age<18) {
			throw new Age_Exception() ;
		}
		else {
			System.out.println("eligeble for the vote");
		}
	}
}

