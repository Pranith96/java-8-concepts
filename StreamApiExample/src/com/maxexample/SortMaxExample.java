package com.maxexample;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortMaxExample {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(4, 1, 9, -3, -7, 10, 11);

		Integer result = list.stream().max(Integer::compare).get();
		System.out.println(result);

		Integer result1 = list.stream().max(Comparator.reverseOrder()).get();
		System.out.println(result1);

	}

}
