package com.reduceexample;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceExample {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		Optional<Integer> data = list.stream().reduce((x, y) -> x + y);
		// int data = list.stream().reduce(0, (x, y) -> x + y);
		System.out.println(data.get());
		System.out.println("-------------------------------------------------------------");

		List<String> list1 = Arrays.asList("a", "b", "c", "d", "e");
		String result = list1.stream().reduce("", (x, y) -> x + y);
		System.out.println(result);

	}
}
