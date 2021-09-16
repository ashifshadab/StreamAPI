package com.ashifshadab.problem5;

import java.util.Arrays;
import java.util.List;

public class StreamCodingExersiseDemo {

	public static void main(String[] args) {

		List<Character> allVowels = Arrays.asList('A', 'E', 'I', 'O', 'U');

		String testString = "I LOVE YOU ";

		long noOfVowels = testString.chars().filter(temp -> allVowels.contains((char) temp)).count();

		long noOfConsonants = testString.chars().filter(temp -> !allVowels.contains((char) temp))
				.filter(tempCh -> (tempCh >= 'A' && tempCh <= 'Z')).count();
		
		System.out.println("No Of Vowels: " + noOfVowels);
        System.out.println("No Of consonants: " + noOfConsonants);

	}

}
