package com.ashifshadab.emptyMethod;

import java.util.stream.Stream;

import com.ashifshadab.dataSet.Student;

/**empty() : Creates an empty stream**/
public class StreamCreationOperationsDemo {

	public static void main(String[] args) {

		Stream<Student> emptyStream = Stream.empty();
        
		System.out.println(emptyStream.count());

	}

}
