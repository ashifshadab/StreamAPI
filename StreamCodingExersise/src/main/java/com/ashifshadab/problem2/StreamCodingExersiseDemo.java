package com.ashifshadab.problem2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCodingExersiseDemo {

	public static void main(String[] args) {

		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");
		
		System.out.println("Printing all member Names");
		memberNames.stream().forEach(System.out::println);

		List<String> refineList = memberNames.stream().filter(name -> name.startsWith("A"))
				.collect(Collectors.toList());

		System.out.println("\nNames starting with A");
		refineList.stream().forEach(System.out::println);

		System.out.println("\nNames starting with S");

		memberNames.stream().filter(name -> name.startsWith("S")).forEach(System.out::println);

		System.out.println("\nNames doesn't start with A and S and make it capital");

		memberNames.stream().filter((name) -> !name.startsWith("A") && !name.startsWith("S")).map(String::toUpperCase)
				.forEach(System.out::println);

	}

}
