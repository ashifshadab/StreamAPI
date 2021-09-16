package com.ashifshadab.anyMatchMethod;

import java.util.ArrayList;
import java.util.List;

//anyMatch() : Any one element matches
public class StreamFindingAndMatchingOperationsDemo {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();

		names.add("David");

		names.add("Johnson");

		names.add("Samontika");

		names.add("Brijesh");

		names.add("John");

		if (names.stream().anyMatch((String name) -> name.length() == 5)) {
			System.out.println("Yes... There is a name exist with 5 letters");
		}

	}

}
