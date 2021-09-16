package com.ashifshadab.reduceMethod;

import java.util.Arrays;
import java.util.OptionalInt;

/** reduce() : Produces a single value **/
public class StreamReducingOperationsDemo {

	public static void main(String[] args) {

		/**
		 * This method performs reduction operation on elements of a stream using
		 * initial value and binary operation.
		 */
		int sum = Arrays.stream(new int[] { 7, 5, 9, 2, 8, 1 }).reduce(0, (a, b) -> a + b);

		System.out.println(sum);

		/**
		 * Another form of reduce() method which takes no initial value. But returns an
		 * Optional object.
		 */
		OptionalInt sum1 = Arrays.stream(new int[] { 7, 5, 9, 2, 8, 1 }).reduce((a, b) -> a + b);

		System.out.println(sum1);

	}

}
