package com.ashifshadab.collectMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//collect() : Returns mutable container
public class StreamReducingOperationsDemo {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
        
		names.add("David");
		         
		names.add("Johnson");
		         
		names.add("Samontika");
		         
		names.add("Brijesh");
		         
		names.add("John");
		         
		//Storing first 3 names in a mutable container 
		         
		List<String> first3Names = names.stream().limit(3).collect(Collectors.toList());
		         
		System.out.println(first3Names);

	}

}
