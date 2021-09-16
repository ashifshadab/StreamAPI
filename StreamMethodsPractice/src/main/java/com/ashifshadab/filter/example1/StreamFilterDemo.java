package com.ashifshadab.filter.example1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterDemo {

	public static void main(String[] args) {

		List<String> daysList = Arrays.asList("Sunday", "Monday", "Tuesday","Wednessday","Thursday","Friday","Saturday");
		
		System.out.println(daysList);
		
		List<String> modifiesDaysList = getModifiesDaysListWithoutFilter(daysList);
		
		System.out.println("Modified without filter");
		modifiesDaysList.stream().forEach(System.out::println);
		
		modifiesDaysList = getModifiesDaysListWithFilter(daysList);
		
		System.out.println("Modified with filter");
		modifiesDaysList.stream().forEach(System.out::println);
	}

	private static List<String> getModifiesDaysListWithFilter(List<String> daysList) {
		
		List<String> result = new ArrayList<>();
		
		result = daysList.stream().filter(day->!"Wednessday".equals(day)).collect(Collectors.toList());
		
		return result;
	}

	private static List<String> getModifiesDaysListWithoutFilter(List<String> daysList) {
		
		List<String> result = new ArrayList<>();
		
		for(String day:daysList) {
			
			if (!"Sunday".equals(day)) { 
                result.add(day);
            }
		}
		
		return result;
	}

}
