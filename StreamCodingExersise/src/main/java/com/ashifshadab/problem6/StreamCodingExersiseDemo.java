package com.ashifshadab.problem6;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Input : 5,3,4,1,3,7,2,9 Output : 1-1,2-1,3-2,4-1,5-1
 * 
 * Input: Sunday,Monday,Sunday,Tuesday,Monday Output:Sunday-2,Monday-2,Tuesday-1
 **/
public class StreamCodingExersiseDemo {

	public static void main(String[] args) {

		List<Integer> inputList = Arrays.asList(5, 3, 4, 1, 3, 7, 2, 9);

		Map<Integer, Long> output = inputList.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		output.entrySet().forEach(temp -> System.out.println(temp.getKey() + "-" + temp.getValue()));

		List<String> stringList = Arrays.asList("Sunday", "Monday", "Sunday", "Tuesday", "Monday");

		Map<String, Long> output1 = stringList.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		output1.entrySet().forEach(temp -> System.out.println(temp.getKey() + "-" + temp.getValue()));

	}
}
