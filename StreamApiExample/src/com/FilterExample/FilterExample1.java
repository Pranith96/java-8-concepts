package com.FilterExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample1 {

	public static void main(String[] args) {

		List<Student> lists = Arrays.asList(new Student(1, 25, "ABC"), new Student(2, 30, "QWER"),
				new Student(3, 24, "XYZ"), new Student(4, 26, "PQR"), new Student(5, 29, "ABC"),
				new Student(6, 25, "OLK"), new Student(7, 27, "POL"));

		List<Student> response = lists.stream().filter(data -> data.getAge() < 27).collect(Collectors.toList());
		// List<Student> response1 = lists.stream().filter(data ->
		// data.getStatus().Equals(Contants.ACTIVE)).collect(Collectors.toList());

		System.out.println(response);
	}

}
