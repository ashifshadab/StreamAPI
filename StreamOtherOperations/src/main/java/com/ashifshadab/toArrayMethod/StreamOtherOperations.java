package com.ashifshadab.toArrayMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//toArray() Returns an array containing elements of a stream
public class StreamOtherOperations {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
        
		names.add("David");
		         
		names.add("Johnson");
		         
		names.add("Samontika");
		         
		names.add("Brijesh");
		         
		names.add("John"); 
		     
		//Storing first 3 names in an array
		     
		Object[] streamArray = names.stream().limit(3).toArray();
		         
		System.out.println(Arrays.toString(streamArray));

	}

}
