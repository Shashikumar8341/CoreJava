package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class EmployeSerializatoin {



	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Employee e1 = new Employee(2000, "sandy", 22000);
//		e1.setSalary(33000.00);
		FileOutputStream fos = new FileOutputStream("employee.ser");
		// i need to trace every moment ---> object state and converting stream of bytes
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e1);
		oos.close();
		//			System.out.println(e1);
		// cloning rules
		// 1. implements clonable

		FileInputStream fis = new FileInputStream("employee.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee emp = (Employee) ois.readObject();
		System.out.println(emp);
	}

}