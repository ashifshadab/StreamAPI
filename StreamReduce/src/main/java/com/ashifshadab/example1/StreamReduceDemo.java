package com.ashifshadab.example1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/***
 * The lambda expression passed to reduce() method takes two Strings and returns
 * the longer String. The result of the reduce() method is an Optional because
 * the list on which reduce() is called may be empty.
 */

public class StreamReduceDemo {

	public static void main(String[] args) {

		List<String> countryNames = Arrays.asList("Pakistan", "Nepal", "China", "United State of America", "Brazil");

		Stream<String> myStream = countryNames.stream();

		Optional<String> longestString = myStream
				.reduce((country1, country2) -> country1.length() > country2.length() ? country1 : country2);

		longestString.ifPresent(System.out::println);

	}

}
