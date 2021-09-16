package com.ashifshadab.maxMethod;

import java.util.Arrays;
import java.util.OptionalInt;

//max() : Finding the maximum
public class StreamReducingOperationsDemo {

	public static void main(String[] args) {

		OptionalInt max = Arrays.stream(new int[] {7, 5, 9, 2, 8, 1}).max();
	    
		System.out.println(max);
	}

}
