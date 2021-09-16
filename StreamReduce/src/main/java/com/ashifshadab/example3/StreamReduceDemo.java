package com.ashifshadab.example3;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Implementation of reduce method to get the combined String
 * **/
public class StreamReduceDemo {

	public static void main(String[] args) {

		String[] stringArray = { "Have", "A", "Nice", "Day" };

		Stream<String> myStream = Arrays.stream(stringArray);
		
		Optional<String> output = myStream.reduce((word1,word2)->word1+"-"+word2);
		
		output.ifPresent(System.out::println);

	}

}
