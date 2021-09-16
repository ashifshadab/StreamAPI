package com.ashifshadab.collection.parallelStream.example1;

import java.util.ArrayList;
import java.util.List;

/**Collection.parallelStream()**/
public class ParrallelStreamDemo {

	public static void main(String[] args) {

		List<String> dataList = getDataList();  

		System.out.println("..................Using Normal Stream................");
		
		dataList.stream().forEach(System.out::println);
		
		System.out.println("..................Using Parrallel Stream................");
		dataList.parallelStream().forEach(System.out::println);
	}

	private static List<String> getDataList() {
		
		List<String> dataList = new ArrayList<>();
		
		dataList.add("Saturday");
		dataList.add("Sunday");
		dataList.add("Monday");
		dataList.add("Tuesday");
		dataList.add("Wednessday");
		dataList.add("Thursday");
		dataList.add("Friday");
		dataList.add("One");
		dataList.add("Two");
		dataList.add("Three");
		dataList.add("Four");
		dataList.add("Five");
		dataList.add("Six");
		dataList.add("Seven");
		dataList.add("Eight");
		dataList.add("Nine");
		dataList.add("Ten");
		dataList.add("Volvo");
		dataList.add("BMW");
		dataList.add("Ford");
		dataList.add("Mazda");
		dataList.add("Mango");   
		dataList.add("Apple");    
		dataList.add("Banana");    
		dataList.add("Grapes");
		
		return dataList;
	}

}
