package com.mapexample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.FilterExample.Student;

public class MapExamples {

	public static void main(String[] args) {

		List<Integer> data = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		List<Integer> mapData = data.stream().map(x -> x + 5).collect(Collectors.toList());

		System.out.println(mapData);

		List<Student> lists = Arrays.asList(new Student(1, 25, "ABC"), new Student(2, 30, "QWER"),
				new Student(3, 24, "XYZ"), new Student(4, 26, "PQR"), new Student(5, 29, "ABC"),
				new Student(6, 25, "OLK"), new Student(7, 27, "POL"));

		lists.stream().map(z -> {
			z.setName("QWERTY");
			z.setAge(20);
			z.setStudentId(1);
			return z;
		}).forEach(System.out::println);
	}

}
