package com.ashifshadab.example2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;

public class IteratorAndSpliteratorDemo {

	public static void main(String[] args) {

		List<String> countryNames = Arrays.asList("Pakistan", "Nepal", "China", "United State of America", "Brazil");

		Stream<String> myStream = countryNames.stream();

		Spliterator<String> spliterator = myStream.spliterator();

		Spliterator<String> spliterator2 = spliterator.trySplit();

		System.out.println(":::::::::::::Using Spliterator:::::::::::::::::");

		spliterator.forEachRemaining(System.out::println);

		System.out.println(":::::::::::::After spliterator.trySplit:::::::::::::::::");

		spliterator2.forEachRemaining(System.out::println);
	}

}
