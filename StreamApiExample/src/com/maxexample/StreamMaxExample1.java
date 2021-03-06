package com.maxexample;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamMaxExample1 {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("A", "D", "V", "B", "C", "G", "H");

		String maxValue = list.stream().max(Comparator.comparing(String::valueOf)).get();
		System.out.println(maxValue);
	}
}
