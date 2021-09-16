package com.ashifshadab.ofMethod;

import java.util.stream.Stream;

/** of(T… values) : Creates a stream from values */
public class StreamCreationOperationsDemo1 {

	public static void main(String[] args) {

		Stream<Integer> streamOfNumbers = Stream.of(7, 2, 6, 9, 4, 3, 1);

		System.out.println(streamOfNumbers.count());

	}

}
