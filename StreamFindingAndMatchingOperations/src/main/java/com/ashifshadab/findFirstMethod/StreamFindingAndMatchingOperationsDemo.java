package com.ashifshadab.findFirstMethod;

import java.util.Optional;
import java.util.stream.Stream;

//findFirst() : Finding first element
public class StreamFindingAndMatchingOperationsDemo {

	public static void main(String[] args) {

		Optional<String> firstElement = Stream.of("First", "Second", "Third", "Fourth").findFirst();
		System.out.println(firstElement);

	}

}
