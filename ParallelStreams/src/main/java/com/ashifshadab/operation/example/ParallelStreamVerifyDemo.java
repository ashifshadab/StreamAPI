package com.ashifshadab.operation.example;

import java.util.stream.IntStream;

public class ParallelStreamVerifyDemo {

	public static void main(String[] args) {

		IntStream range = IntStream.rangeClosed(1, 10);

		System.out.println("Is it Parallel : " + range.isParallel());

		IntStream range2 = IntStream.rangeClosed(1, 10);

		IntStream parallelRange = range2.parallel();

		System.out.println("Is it Parallel : " + parallelRange.isParallel());

		System.out.println("...............Normal Stream.............");

		range.forEach(x -> {
			System.out.println("Executing Thread Name : " + Thread.currentThread().getName() + " ::: and value is :" + x);
		});

		System.out.println("...............Parallel Stream.............");

		range2.parallel().forEach(
				x -> System.out.println("Executing Thread Name : " + Thread.currentThread().getName() + " ::: and value is :" + x));

	}

}
