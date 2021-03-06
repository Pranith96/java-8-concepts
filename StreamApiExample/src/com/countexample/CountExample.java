package com.countexample;

import java.util.Arrays;
import java.util.List;

public class CountExample {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 5, 3, 2, 4, 2, 67, 8, 9);
		long result = list.stream().count();
		System.out.println(result);
		System.out.println("------------------------------------");

		long result2 = list.stream().distinct().count();
		System.out.println(result2);

		System.out.println("------------------------------------");

		long result1 = list.stream().filter(x -> x % 2 == 0).count();
		System.out.println(result1);

	}

}
