package Has_A.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Student {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Address a1 = new Address("ramagundam", "TS", 505208);
		Address a2 = new Address("secunderabad", "ts", 500008);
		Address a3 = new Address("lbnagar", "HYD", 500016);
		FileOutputStream fos = new FileOutputStream("Address");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a1);
		oos.writeObject(a2);
		oos.writeObject(a3);
		oos.close();
		FileInputStream fis = new FileInputStream("Address");
		try (ObjectInputStream ois = new ObjectInputStream(fis)) {
			Address ar = (Address) ois.readObject();
			System.out.println(ar);
		}

		//		Address[] p={a1, a2, a3};
		//		for (Address Student : p) {
		//			System.out.println(Student);
		//		}
	}
}
