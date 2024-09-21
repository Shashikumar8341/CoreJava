package ArrayList;

import java.util.HashSet;
import java.util.Set;

public class String_Array {
	public static void main(String[] args) {
		String[] name = { "user_id:1", "user_id:2", "user_id:3", "user_id:4", "user_id:5" };
		Set<String_Array> s = new HashSet<>();
		int index = 0;
		for (int i = 0; i < name.length; i++) {
			for (int j = i + 1; j < name.length; j++) {
				if (name[i] == name[j]) {
				//	s.add(name[i]);
				}
			}
			}
		for (String_Array string_Array : s) {
			System.out.println(string_Array);
		}

	}
}
