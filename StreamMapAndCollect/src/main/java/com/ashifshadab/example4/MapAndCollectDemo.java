package com.ashifshadab.example4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MapAndCollectDemo {

	public static void main(String[] args) {

		List<Double> doubleList = new ArrayList<>();

		doubleList.add(1.1);

		doubleList.add(3.6);

		doubleList.add(9.2);

		doubleList.add(4.7);

		doubleList.add(12.1);

		doubleList.add(5.0);

		System.out.println("Original Values:");

		doubleList.stream().forEach(System.out::println);

		List<Integer> integerList = doubleList.stream().mapToInt((value) -> (int) Math.ceil(value)).boxed()
				.collect(Collectors.toList());

		System.out.println("Modifyied Values useing mapToInt and boxed:");
		integerList.forEach(System.out::println);

		IntStream intStream = doubleList.stream().mapToInt(value -> (int) Math.ceil(value));

		System.out.println("Modifyied Values useing mapToInt and IntStream:");
		intStream.forEach(System.out::println);
	}

}
