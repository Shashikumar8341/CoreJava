package Remove_Elements;
import java.util.*;
import java.util.concurrent.locks.AbstractQueuedLongSynchronizer.ConditionObject;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class Remove_streamFilter {
	/**
	 * Removing collection elements using Stream filter
	 * @author shashi
	 */
	public static void main(String[] args) {
		Set<Integer>s=new LinkedHashSet<Integer>(); {

			s.add(10);
			s.add(12);
			s.add(13);
			s.add(14);
			s.add(15);
			s.add(16);
			s.add(17);
			int Conditionvalue=12;
			System.out.println(s);
//			Set<Integer>a=s.stream().filter(a->a%Conditionvalue !=0).collect(Collectors.toList());
//			Collection<Object>c=s.stream().filter(e->!e.startsWith(12)).collect(Collectors.toList());
			//		List<String> subjects = new ArrayList<>();
//		subjects.add("Java");
//		subjects.add("C");
//		subjects.add("C++");
//		subjects.add("SQL");
//		subjects.add("PHP");
//		System.out.println("Before remove:");
//		System.out.println(subjects);
//		Collection<String> filteredSubjects = subjects
//		.stream()
//		.filter(e -> !e.startsWith("S"))
//		.collect(Collectors.toList());
//		System.out.println("After remove:");
//		System.out.println(filteredSubjects);
		}}
		}
		