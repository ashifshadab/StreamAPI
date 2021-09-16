package com.ashifshadab.intro.example2;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Each Stream class represents a single-use sequence of data and supports
 * several I/O operations Whenever a terminal operation is called on a Stream
 * object, the instance gets consumed and closed. Therefore, we're only allowed
 * to perform a single operation that consumes a Stream, otherwise, we'll get an
 * exception java.lang.IllegalStateException: stream has already been operated
 * upon or closed
 **/

public class StreamFindMaxMin {

	public static void main(String[] args) {

		ArrayList<Integer> myList = new ArrayList<Integer>();

		myList.add(7);
		myList.add(18);
		myList.add(10);
		myList.add(24);
		myList.add(17);
		myList.add(5);

		System.out.println("Original List is : " + myList);

		Stream<Integer> myStream = myList.stream();

		myStream.forEach(element -> System.out.println("Iterating Stream's data : " + element));

		// Must Obtain a new Stream
		myStream = myList.stream();

		Optional<Integer> maxValue = myStream.max(Integer::compare);

		if (maxValue.isPresent()) {
			System.out.println("Max Value of List : " + maxValue.get());
		}

		// Must Obtain a new Stream
		myStream = myList.stream();
		
		Optional<Integer>minValue= myStream.min(Integer::compare);
		
		if (minValue.isPresent()) {
			System.out.println("Min Value of List : " + minValue.get());
		}

	}

}
