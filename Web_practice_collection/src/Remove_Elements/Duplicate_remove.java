package Remove_Elements;
import java.util.*;

public class Duplicate_remove {
public static void main(String[] args) {
	List<String>s=new ArrayList<>();
	s.add("apple");
	s.add("orange");
	s.add("banana");
	s.add("grape");
	s.add("paineapple");
	s.add("banana");
	System.out.println(s);
	Set<String>ss=new TreeSet<>(s);
	System.out.println(ss);
	}
}
