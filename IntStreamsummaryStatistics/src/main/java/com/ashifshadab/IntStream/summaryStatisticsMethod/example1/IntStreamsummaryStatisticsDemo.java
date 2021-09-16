package com.ashifshadab.IntStream.summaryStatisticsMethod.example1;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

/**
 * IntStream summaryStatistics() returns an IntSummaryStatistics describing
 * various summary data about the elements of this stream like count of number
 * of elements in the IntStream, average of all elements present in IntStream,
 * minimum and maximum element in the IntStream and so on. This is a terminal
 * operation
 **/
public class IntStreamsummaryStatisticsDemo {

	public static void main(String[] args) {

		IntStream stream = IntStream.of(4, 5, 6, 7);
		
		IntSummaryStatistics summary_data = stream.summaryStatistics();
		
		System.out.println(summary_data);

	}

}
