package com.distinctexample;

import java.util.Arrays;
import java.util.List;

public class DistinctExample {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 5, 3, 2, 4, 2, 67, 8, 9);
		list.stream().distinct().forEach(System.out::println);

	}
}
