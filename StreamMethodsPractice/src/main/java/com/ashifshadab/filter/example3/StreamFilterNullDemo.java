package com.ashifshadab.filter.example3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterNullDemo {

	public static void main(String[] args) {

		List<String> daysList = Arrays.asList("Sunday", "Monday", "Tuesday",null,"Wednessday","Thursday","Friday",null,"Saturday",null);
		
		System.out.println("Printing origing List");
		daysList.stream().forEach(System.out::println);
		
		List<String>modifyList= daysList.stream().filter(day->null != day).collect(Collectors.toList());
		
		System.out.println("Printing Modify List");
		modifyList.stream().forEach(System.out::println);

	}

}
