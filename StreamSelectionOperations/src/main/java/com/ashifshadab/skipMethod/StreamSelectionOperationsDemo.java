package com.ashifshadab.skipMethod;

import java.util.ArrayList;
import java.util.List;

/** skip() : Skips first n elements **/
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

		// Skipping first 4 names

		names.stream().skip(4).forEach(System.out::println);

	}

}
