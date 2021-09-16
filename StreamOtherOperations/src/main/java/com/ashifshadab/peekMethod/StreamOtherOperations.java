package com.ashifshadab.peekMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * peek() Performs an additional action on each element of a stream. This method
 * is only to support debugging where you want to see the elements as you pass
 * in a pipeline.
 **/
public class StreamOtherOperations {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();

		names.add("David");

		names.add("Johnson");

		names.add("Samontika");

		names.add("Brijesh");

		names.add("John");

		names.add("David");

		names.stream().filter(name -> name.length() > 5).peek(e -> System.out.println("Filtered Name :" + e))
				.map(String::toUpperCase).peek(e -> System.out.println("Mapped Name :" + e)).toArray();
	}

}
