import java.util.Optional;

public class OptionalExample1 {

	public static void main(String[] args) {

		String[] data = new String[10];

	//	String result = data[5].substring(1, 5);
	//	System.out.println(result);

		
		Optional<String> isResult = Optional.ofNullable(data[5]);
		
		System.out.println(isResult);
		
		if(isResult.isPresent()) {
			String result = data[5].substring(1,5);
			System.out.println(result);
		}else {
			System.out.println("No data");
		}
	}
}
