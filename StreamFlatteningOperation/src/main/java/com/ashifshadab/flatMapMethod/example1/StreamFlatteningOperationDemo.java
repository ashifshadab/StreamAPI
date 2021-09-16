package com.ashifshadab.flatMapMethod.example1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatteningOperationDemo {

	public static void main(String[] args) {

		List<List<String>> allproducts = getData();

		oldWay(allproducts);

		List<String> flatMapList = allproducts.stream().flatMap(plist -> plist.stream()).collect(Collectors.toList());

		System.out.println("List After Applying mapping and Flattening: \n");

		System.out.println(flatMapList);

	}

	private static void oldWay(List<List<String>> allproducts) {

		List<String> listOfAllProducts = new ArrayList<String>();

		for (List<String> pro : allproducts) {
			for (String product : pro) {
				listOfAllProducts.add(product);
			}
		}

		System.out.println("List Before Applying mapping and Flattening: \n");

		System.out.println(listOfAllProducts);

		System.out.println();
	}

	private static List<List<String>> getData() {
		List<String> productlist1 = Arrays.asList("Printer", "Mouse", "Keyboard", "Motherboard");
		List<String> productlist2 = Arrays.asList("Scanner", "Projector", "Light Pen");
		List<String> productlist3 = Arrays.asList("Pen Drive", "Charger", "WIFI Adapter", "Cooling Fan");
		List<String> productlist4 = Arrays.asList("CPU Cabinet", "WebCam", "USB Light", "Microphone", "Power cable");

		List<List<String>> allproducts = new ArrayList<List<String>>();

		allproducts.add(productlist1);
		allproducts.add(productlist2);
		allproducts.add(productlist3);
		allproducts.add(productlist4);
		return allproducts;
	}

}
