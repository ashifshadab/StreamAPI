package com.ashifshadab.noneMatchMethod;

import java.util.ArrayList;
import java.util.List;

//noneMatch() : No element matches
public class StreamFindingAndMatchingOperationsDemo {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();

		names.add("David");

		names.add("Johnson");

		names.add("Samontika");

		names.add("Brijesh");

		names.add("John");

		if (names.stream().noneMatch((String name) -> name.length() == 2)) {
			System.out.println("There is no two letter name");
		}

	}

}
