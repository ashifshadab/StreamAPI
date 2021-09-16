package com.ashifshadab.example1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;

public class IteratorAndSpliteratorDemo {

	public static void main(String[] args) {

		List<String> countryNames = Arrays.asList("Pakistan", "Nepal", "China", "United State of America", "Brazil");

		Stream<String> myStream = countryNames.stream();

		Iterator<String> iterator = myStream.iterator();

		System.out.println(":::::::::::::Using Iterator:::::::::::::::::");
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		
		myStream = countryNames.stream();
		
		Spliterator<String> spliterator = myStream.spliterator();
		
		System.out.println(":::::::::::::Using Spliterator:::::::::::::::::");
		
		while (spliterator.tryAdvance(System.out::println));
	}

}
