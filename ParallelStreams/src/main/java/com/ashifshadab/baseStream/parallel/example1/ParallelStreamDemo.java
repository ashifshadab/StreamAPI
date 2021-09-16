package com.ashifshadab.baseStream.parallel.example1;

import java.util.stream.IntStream;

/** BaseStream.parallel() */
public class ParallelStreamDemo {

	public static void main(String[] args) {

		System.out.println("Normal...");

		// rangeClosed() methods returns a sequential ordered IntStream
		// from startInclusive (inclusive) to endInclusive (inclusive)
		// by an incremental step of 1.
		IntStream range = IntStream.rangeClosed(1, 10);

		range.forEach(System.out::println);

		System.out.println("Parallel...");

		range = IntStream.rangeClosed(1, 10);

		range.parallel().forEach(System.out::println);

	}

}
