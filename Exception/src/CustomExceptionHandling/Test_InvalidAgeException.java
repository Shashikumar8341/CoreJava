package CustomExceptionHandling;

public class Test_InvalidAgeException {
	static void valied(int age)throws InvalidAgeException{
		if (age<18) {

			throw new InvalidAgeException("valid vote");
		}	
		else {
			System.out.println("welcome to valid vote");
		}
	}	
	public static void main(String[] args) {
		try {
		valied(13);

		} catch (InvalidAgeException iae) {
			System.out.println("caught the exception");
			System.out.println("exception occured"+iae);
		}
		System.out.println("rest of the code");
	}
}
