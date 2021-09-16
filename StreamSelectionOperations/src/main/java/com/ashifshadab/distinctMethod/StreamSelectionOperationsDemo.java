package com.ashifshadab.distinctMethod;

import java.util.ArrayList;
import java.util.List;

/**distinct() : Selects only unique elements**/
public class StreamSelectionOperationsDemo {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
        
		names.add("David");
		         
		names.add("Johnson");
		         
		names.add("Samontika");
		         
		names.add("Brijesh");
		         
		names.add("John");
		         
		names.add("David");
		         
		names.add("Brijesh");
		         
		//Selecting only unique names
		         
		names.stream().distinct().forEach(System.out::println);
	}

}
