package com.ashifshadab.minMethod;

import java.util.Arrays;
import java.util.OptionalInt;

//min() : Finding the minimum
public class StreamReducingOperationsDemo {

	public static void main(String[] args) {

		OptionalInt min = Arrays.stream(new int[] {7, 5, 9, 2, 8, 1}).min();
        System.out.println(min);

	}

}
