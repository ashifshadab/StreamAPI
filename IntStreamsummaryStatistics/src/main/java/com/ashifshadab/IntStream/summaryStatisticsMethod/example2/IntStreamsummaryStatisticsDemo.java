package com.ashifshadab.IntStream.summaryStatisticsMethod.example2;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class IntStreamsummaryStatisticsDemo {

	public static void main(String[] args) {

		IntStream stream = IntStream.range(5, 9);

		IntSummaryStatistics summary_data = stream.summaryStatistics();

		System.out.println(summary_data);

	}

}
