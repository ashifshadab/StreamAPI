package com.ashifshadab.sortedMethod;

import java.util.ArrayList;
import java.util.List;

/**sorted() : Sorting according to natural order
 * Returns a stream consisting of elements sorted according to natural order.
**/
public class StreamSortingOperationsDemo {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
        
		names.add("David");
		         
		names.add("Johnson");
		         
		names.add("Samontika");
		         
		names.add("Brijesh");
		         
		names.add("John");
		         
		//Sorting the names according to natural order
		         
		names.stream().sorted().forEach(System.out::println);

	}

}
