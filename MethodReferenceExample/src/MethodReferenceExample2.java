import java.util.Arrays;
import java.util.List;

public class MethodReferenceExample2 {

	public static void main(String[] args) {

		List<Student> list = Arrays.asList(new Student(1, "ABC", 15), new Student(2, "ACB", 13),
				new Student(3, "QWE", 18), new Student(4, "ZYE", 11));

		StudentCompare StudentCompare = new StudentCompare();

		list.stream().sorted((a, b) -> StudentCompare.compare(a, b)).forEach(System.out::println);

		System.out.println(".......................................");
		list.stream().sorted(StudentCompare::compare).forEach(System.out::println);

	}

}
