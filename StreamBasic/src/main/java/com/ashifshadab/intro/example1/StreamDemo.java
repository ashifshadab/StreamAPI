package com.ashifshadab.intro.example1;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {

		
		ArrayList<Integer> myList = new ArrayList<Integer>();
		
		myList.add(7);
		myList.add(18);
		myList.add(10);
		myList.add(24);
		myList.add(17);
		myList.add(5);
		
		System.out.println("Original List is : "+myList);
		
		//Obtaining the Stream to the arrayList
		Stream<Integer> myStream =myList.stream();
		
		//Print the value from Stream
		myStream.forEach(element->System.out.println("The Stream elemetns is :"+element));
		

	}

}
