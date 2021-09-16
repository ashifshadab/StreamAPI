package com.ashifshadab.flatMapMethod.example2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFlatteningOperationDemo {

	public static void main(String[] args) {

		String[][] array = new String[][] { { "a", "b" }, { "c", "d" }, { "e", "f" } };

		String[] result = Stream.of(array) 	// Stream<String[]>
				.flatMap(Stream::of)		// Stream<String>
				.toArray(String[]::new);	// [a, b, c, d, e, f]

		System.out.println("Printing array's element:-");
		for (String s : result) {
			System.out.println(s);
		}

		List<String> collect = Stream.of(array).flatMap(Stream::of).collect(Collectors.toList());
		
		System.out.println("Printing List element:-");
		collect.stream().forEach(System.out::println);
	}

}
