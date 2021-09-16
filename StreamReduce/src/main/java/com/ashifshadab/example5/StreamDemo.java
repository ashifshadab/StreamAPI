package com.ashifshadab.example5;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {

		ArrayList<Integer> myList = new ArrayList<Integer>();

		myList.add(1);
		myList.add(2);
		myList.add(3);
		
		Stream<Integer> myStream = myList.stream();
		
		Optional <Integer> multiplyOfNumber = myStream.reduce((num1,num2)->num1*num2);
		
		multiplyOfNumber.ifPresent(System.out::println);
		
		myStream = myList.stream();
		
		int product = myStream.reduce(1, (num1,num2)->num1*num2);
		
		System.out.println("Product as int : "+product);

	}

}
