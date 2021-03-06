package com.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {

	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
		List<Integer> list2 = Arrays.asList(5, 6, 7, 8);
		List<Integer> list3 = Arrays.asList(9, 10, 11, 12);
		List<Integer> list4 = Arrays.asList(13, 14, 15, 16);

		List<List<Integer>> lists = Arrays.asList(list1, list2, list3, list4);
		System.out.println(lists);

		List<Integer> output = lists.stream().flatMap(x -> x.stream().filter(y -> y % 2 == 0))
				.collect(Collectors.toList());
		System.out.println(output);

		String[][] data = new String[][] { { "a", "b" }, { "c", "d" }, { "e", "f" } };
		List<String> outputData = Arrays.stream(data).flatMap(x -> Arrays.stream(x)).collect(Collectors.toList());
		System.out.println(outputData);
	}

}
