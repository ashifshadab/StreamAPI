package com.ashifshadab.allMatchMethod;

import java.util.ArrayList;
import java.util.List;

//allMatch() : All elements matches
public class StreamFindingAndMatchingOperationsDemo {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();

		names.add("Sampada");

		names.add("Johnson");

		names.add("Samontika");

		names.add("Brijesh");

		if (names.stream().allMatch((String name) -> name.length() > 5)) {
			System.out.println("All are big names");
		}

	}

}
