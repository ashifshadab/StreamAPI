package com.ashifshadab.creation.example1;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {

		// emptyStream();

		// streamOfCollection();

		// StreamOfArray();

		// streamBuilder();

		// streamGenerate();

		streamIterate();

	}

	/**
	 * Another way of creating an infinite stream is by using the iterate() method
	 * The first element of the resulting stream is the first parameter of the
	 * iterate() method. When creating every following element, the specified
	 * function is applied to the previous element.
	 **/
	private static void streamIterate() {

		Stream<Integer> streamIterated = Stream.iterate(40, n -> n + 2).limit(20);

		streamIterated.forEach(element -> System.out.println("Element of streamIterated : " + element));

	}

	/**
	 * The generate() method accepts a Supplier<T> for element generation. As the
	 * resulting stream is infinite, the developer should specify the desired size,
	 * or the generate() method will work until it reaches the memory limit The code
	 * bellow creates a sequence of ten strings with the value “element.”
	 **/
	private static void streamGenerate() {

		Stream<String> streamGenerated = Stream.generate(() -> "element").limit(10);

		streamGenerated.forEach(element -> System.out.println("Element of streamGenerated : " + element));

	}

	/**
	 * When builder is used, the desired type should be additionally specified in
	 * the right part of the statement, otherwise the build() method will create an
	 * instance of the Stream<Object>:
	 **/
	private static void streamBuilder() {

		Stream<String> streamBuilder = Stream.<String>builder().add("a").add("b").add("c").build();

		streamBuilder.forEach(element -> System.out.println("Element of streamBuilder : " + element));

	}

	private static void StreamOfArray() {

		Stream<String> streamOfArray = Stream.of("a", "b", "c", "d");

		streamOfArray.forEach(element -> System.out.println("Element of streamOfArray : " + element));

		String[] arr = new String[] { "a", "b", "c", "d", "e", "f" };

		Stream<String> streamOfArrayFull = Arrays.stream(arr);

		Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3);

		streamOfArrayFull.forEach(element -> System.out.println("All element of Array : " + element));

		streamOfArrayPart.forEach(element -> System.out.println("Array some element : " + element));

	}

	private static void streamOfCollection() {
		Collection<String> collection = Arrays.asList("a", "b", "c");
		Stream<String> myStream = collection.stream();

		myStream.forEach(element -> System.out.println(element));
	}

	/**
	 * Empty Stream Use the empty() method upon creation to avoid returning null for
	 * streams with no element
	 **/
	private static void emptyStream() {
		Stream<String> emptyStream = getStream(null);

		emptyStream.forEach(element -> System.out.println(element));
	}

	public static Stream<String> getStream(List<String> list) {
		return list == null || list.isEmpty() ? Stream.empty() : list.stream();
	}

}
