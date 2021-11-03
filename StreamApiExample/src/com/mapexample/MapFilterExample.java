package com.mapexample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapFilterExample {

	public static void main(String[] args) {

		List<Integer> data = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
		List<Integer> list = data.stream().filter(x -> x % 2 == 0).map(y -> y * 5).collect(Collectors.toList());
		System.out.println(list);
	}

}
