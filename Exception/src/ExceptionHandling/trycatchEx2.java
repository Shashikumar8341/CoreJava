package ExceptionHandling;

import java.io.File;

public class trycatchEx2 {

	public static void main(String[] args) {
		try {
			File fl=new File("F:\\Recordings\\Captures\\sk.ssk.txt");
			System.out.println(fl.createNewFile());
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("File saved successfully");		
	}
}
