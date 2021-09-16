package com.ashifshadab.streamMethod;

import java.util.ArrayList;
import java.util.List;

public class StreamCreationOperationsDemo {

	public static void main(String[] args) {

		List<String> listOfStrings = new ArrayList<>();
        
		listOfStrings.add("One");
		         
		listOfStrings.add("Two");
		         
		listOfStrings.add("Three");
		         
		listOfStrings.stream().forEach(System.out::println);

	}

}
