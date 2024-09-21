package PrintWriter;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws FileNotFoundException {

		// is converting obj into text format, console or any other resources like file
		PrintWriter writer = new PrintWriter(System.out);
		writer.println("welcome to print writer class");
		writer.println(12.345);
//		writer.println(new person(1, "sandy", "sandy@ciq.com"));
		writer.flush();
		writer.close();

		PrintWriter out = new PrintWriter("print.txt");
		out.print("welcome to print writer class");
		out.flush();
		out.close();
	}
}