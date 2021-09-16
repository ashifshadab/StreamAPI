package com.ashifshadab.countMethod;

import java.util.ArrayList;
import java.util.List;

//count() : Counting the elements
public class StreamReducingOperationsDemo {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();

		names.add("David");

		names.add("Johnson");

		names.add("Samontika");

		names.add("Brijesh");

		names.add("John");

		// Counting the names with length > 5

		long noOfBigNames = names.stream().filter((String name) -> name.length() > 5).count();

		System.out.println(noOfBigNames);

	}

}
