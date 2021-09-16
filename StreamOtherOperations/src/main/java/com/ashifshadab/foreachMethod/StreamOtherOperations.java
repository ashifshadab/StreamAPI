package com.ashifshadab.foreachMethod;

import java.util.stream.Stream;

//forEach() Performs an action on all elements of a stream.
public class StreamOtherOperations {

	public static void main(String[] args) {

		Stream.of("First", "Second", "Second", "Third", "Fourth").limit(3).distinct().forEach(System.out::println);

	}

}
