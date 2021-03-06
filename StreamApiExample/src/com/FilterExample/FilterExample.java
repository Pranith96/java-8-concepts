package com.FilterExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterExample {

	public static void main(String[] args) {

		List<Integer> data = new ArrayList<>();
		data.add(1);
		data.add(2);
		data.add(3);
		data.add(4);
		data.add(5);

		List<Integer> data1 = Arrays.asList(1, 2, 3, 4, 5, 6);

		Stream<Integer> response = data1.stream().filter(x -> x % 2 == 0);
		List<Integer> responselist = data1.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		System.out.println(responselist);

		data1.stream().filter(x -> x % 2 == 0).forEach(y -> System.out.println(y));
	}

}
