import java.util.Arrays;
import java.util.List;

public class MethodReferenceExample1 {

	public static void main(String[] args) {

		List<String> data = Arrays.asList("a", "b", "c", "e");

		data.forEach(x -> System.out.println(x));
		data.forEach(System.out::println);
	}
}
