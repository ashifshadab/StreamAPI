package com.ashifshadab.example1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapAndCollectDemo {

	public static void main(String[] args) {

		List<String> alpha = Arrays.asList("a", "b", "c", "d");

		// Before Java8
		List<String> alphaUpper = new ArrayList<>();
		for (String s : alpha) {
			alphaUpper.add(s.toUpperCase());
		}

		System.out.println("Original : "+alpha); 
		System.out.println("By Loop : "+alphaUpper); 
		
		
		List<String> collect = alpha.stream().map(String::toUpperCase).collect(Collectors.toList());
		
        System.out.println("By map() : "+collect);
        
        List<Integer> num = Arrays.asList(1,2,3,4,5);
        System.out.println("Original : "+num); 
        
        List<Integer> myIntList = num.stream().map(n->n*2).collect(Collectors.toList());
        
        System.out.println("By map() : "+myIntList);
	}

}
