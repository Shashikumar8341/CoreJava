package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.jar.Attributes.Name;

public class Try_catch {

	public static void main(String[] args) {
		int i=50;
		int j=0;
		int data  ;
		try {
			 data = (i/j);
		} catch (ArithmeticException e) {
			System.out.println(i/(j+2));
	}finally {
		System.out.println(i+(j/2));
	}
	}
}