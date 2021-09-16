package com.ashifshadab.mapMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * map() : Applies a function 
 * Returns a stream consisting of results after
 * applying given function to elements of the stream.
 **/
public class StreamMappingOperationsDemo {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();

		names.add("David");

		names.add("Johnson");

		names.add("Samontika");

		names.add("Brijesh");

		names.add("John");

		// Returns length of each name
		names.stream().map(String::length).forEach(System.out::println);

	}

}
