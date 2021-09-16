package com.ashifshadab.ofMethod;

import java.util.stream.Stream;

import com.ashifshadab.dataSet.Student;

/**of(T t) : Creates a stream of single element of type T*/
public class StreamCreationOperationsDemo {

	public static void main(String[] args) {

		Stream<Student> singleElementStream = Stream.of(new Student());
        
		System.out.println(singleElementStream.count());

	}

}
