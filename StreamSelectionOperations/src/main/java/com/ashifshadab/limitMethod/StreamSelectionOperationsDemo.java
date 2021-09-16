package com.ashifshadab.limitMethod;

import java.util.ArrayList;
import java.util.List;

/** limit() : Selects first n elements **/
public class StreamSelectionOperationsDemo {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();

		names.add("David");

		names.add("Johnson");

		names.add("Samontika");

		names.add("Brijesh");

		names.add("John");

		names.add("David");

		names.add("Brijesh");

		// Selecting first 4 names

		names.stream().limit(4).forEach(System.out::println);

	}

}
