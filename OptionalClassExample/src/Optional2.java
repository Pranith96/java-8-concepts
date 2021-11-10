import java.util.Optional;

public class Optional2 {

	public static void main(String[] args) {

		Optional<String> data = Optional.of("Hii Welcome");

		Optional<String> result = Optional.empty();

		System.out.println(data);

		if (data.isPresent()) {
			System.out.println(data);
		} else {
			System.out.println("No data");
		}
		
		data.ifPresent(x -> System.out.println("Data is present"));
		result.ifPresent(y -> System.out.println("Data is Empty"));

	}
}