package Remove_Elements;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Max_number {
	/**
	 * How To Find Maximum Number
	 * @author shiva.netha
	 */
	    public static void main(String[] args) {
	        List<Integer> numbers = Arrays.asList(4, 2, 1, 3, 1, 4, 1);

	        int minValue = Collections.min(numbers);
	        int maxValue = Collections.max(numbers);

	        long count = numbers.stream().filter(num -> num == minValue).count();
	        long counts = numbers.stream().filter(num -> num == maxValue).count();

	        System.out.println("Minimum Value: " + minValue);
	        System.out.println("Number of Occurrences: " + count);
	        System.out.println("Minimum Value: " +maxValue);
	        System.out.println("Number of Occurrences: " + counts);
	    }
}