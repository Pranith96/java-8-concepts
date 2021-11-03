package com.sortedExample;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.FilterExample.Student;

public class StreamSortedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> data = Arrays.asList(1, 21, 2, 12, 3, 11, 4, 17, 5, 15, 6, 20, 7, 8, 19, 9, 10);

		List<Integer> list = data.stream().sorted().collect(Collectors.toList());
		System.out.println(list);
		System.out.println("----------------------------------------------------------------------------------");

		List<Student> lists = Arrays.asList(new Student(1, 25, "ABC"), new Student(2, 30, "QWER"),
				new Student(3, 24, "XYZ"), new Student(4, 26, "PQR"), new Student(5, 29, "ABC"),
				new Student(6, 25, "OLK"), new Student(7, 27, "POL"));
		List<Student> data1 = lists.stream().sorted(Comparator.comparing(Student::getName))
				.collect(Collectors.toList());
		System.out.println(data1);
		System.out.println("----------------------------------------------------------------------------------");

		Map<String, Student> map = new HashMap<>();
		map.put("A", new Student(1, 25, "ABC"));
		map.put("E", new Student(2, 30, "QWER"));
		map.put("G", new Student(3, 24, "XYZ"));
		map.put("I", new Student(4, 26, "PQR"));
		map.put("B", new Student(5, 29, "ABC"));
		map.put("D", new Student(6, 25, "OLK"));
		map.put("H", new Student(7, 27, "POL"));

		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(x -> System.out.println(x));
		System.out.println("----------------------------------------------------------------------------------");
		Map<String, Student> map1 = map.entrySet().stream()
				.sorted(Map.Entry.comparingByValue(Comparator.comparing(Student::getName)))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (x, y) -> x, LinkedHashMap::new));
		System.out.println(map1);
	}

}
