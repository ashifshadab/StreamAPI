package com.ashifshadab.findAnyMethod;

import java.util.Optional;
import java.util.stream.Stream;

//findAny() : Finding any element
public class StreamFindingAndMatchingOperationsDemo {

	public static void main(String[] args) {

		Optional<String> anyElement = Stream.of("First", "Second", "Third", "Fourth").findAny();
		
		System.out.println(anyElement);


	}

}
