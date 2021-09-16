package com.ashifshadab.sortedMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * sorted(Comparator) : Sorting according to supplied comparator Returns a
 * stream consisting of elements sorted according to supplied Comparator.
 **/
public class StreamSortingOperationsDemo2 {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();

		names.add("David");

		names.add("Johnson");

		names.add("Samontika");

		names.add("Brijesh");

		names.add("John");

		// Sorting the names according to their length

		names.stream().sorted((String name1, String name2) -> name1.length() - name2.length())
				.forEach(System.out::println);

	}

}
