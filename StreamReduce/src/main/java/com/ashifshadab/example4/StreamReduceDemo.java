package com.ashifshadab.example4;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

/** Implementation of reduce method to get the sum of all elements **/

public class StreamReduceDemo {

	public static void main(String[] args) {

		ArrayList<Integer> myList = new ArrayList<Integer>();

		myList.add(1);
		myList.add(2);
		myList.add(2);
		myList.add(5);
		myList.add(3);
		myList.add(2);

		Stream<Integer> myStream = myList.stream();

		Optional<Integer> outPut = myStream.reduce((num1, num2) -> num1 + num2);

		outPut.ifPresent(System.out::println);
	}

}
