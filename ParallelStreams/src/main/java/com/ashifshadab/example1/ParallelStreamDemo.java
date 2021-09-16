package com.ashifshadab.example1;

import java.util.ArrayList;

public class ParallelStreamDemo {

	public static void main(String[] args) {

		ArrayList<Double> myList = new ArrayList<>();

		myList.add(7.0);
		myList.add(18.0);
		myList.add(10.0);
		myList.add(24.0);
		myList.add(17.0);
		myList.add(5.0);

		/**
		 * Notice that the accumulator function multiplies the square roots of two
		 * elements, but the combiner multiplies the partial results. Thus, the two
		 * functions differ. Moreover, for this computation to work correctly, they must
		 * differ.
		 */
		double productOfSquareRoots = myList.parallelStream().reduce(1.0, (a, b) -> a * Math.sqrt(b), (a, b) -> a * b);

		System.out.println("Products of square Roots : " + productOfSquareRoots);

		/**
		 * Won't Work Wrong output, In this version of reduce( ), the accumulator and
		 * the combiner function are one and the same. This results in an error because
		 * when two partial results are combined, their square roots are multiplied
		 * together rather than the partial results, themselves. As a point of interest,
		 * if the stream in the preceding call to reduce( ) had been changed to a
		 * sequential stream, then the operation would yield the correct answer because
		 * there would have been no need to combine two partial results. The problem
		 * occurs when a parallel stream is used.
		 **/
		productOfSquareRoots = myList.parallelStream().reduce(1.0, (a, b) -> a * Math.sqrt(b));

		System.out.println("Products of square Roots : " + productOfSquareRoots);

	}

}
