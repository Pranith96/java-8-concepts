import java.util.Optional;

public class OptionalExample3 {

	public static void main(String[] args) {
	
		Optional<String> data = Optional.of("Hii Welcome");
		System.out.println(data.filter(x -> x.equals("HII WELCOME")));
		System.out.println(data.filter(x -> x.equalsIgnoreCase("HII WELCOME")));
	}
}
